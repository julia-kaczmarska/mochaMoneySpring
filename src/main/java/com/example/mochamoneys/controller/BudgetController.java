package com.example.mochamoneys.controller;

import com.example.mochamoneys.controller.dto.BudgetDto;
import com.example.mochamoneys.controller.dto.ExpenseDto;
import com.example.mochamoneys.controller.dto.IncomeDto;
import com.example.mochamoneys.controller.mapper.BudgetDtoMapper;
import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

import static com.example.mochamoneys.service.BudgetDtoService.getLastDayOfMonthUsingYearMonth;

@RestController
@RequiredArgsConstructor
public class BudgetController {

    private final BudgetService budgetService;

    @GetMapping("budget/{userId}")
    public BudgetDto getBudget(@PathVariable Long userId, @RequestParam int year, @RequestParam int month) {

        Budget budget = budgetService.getBudgetByUserId(userId);
        BudgetDto budgetDto = BudgetDtoMapper.mapToBudgetDto(budget);
        Long budgetId = budgetService.getBudgetIdByUserId(userId);
        LocalDate dateFrom = LocalDate.of(year, month, 1);
        LocalDate dateTo = LocalDate.of(year, month, getLastDayOfMonthUsingYearMonth(YearMonth.of(year, month)));

        // Pobieramy przychody i dodajemy je do odpowiadającego DTO
        List<IncomeDto> incomeDtos = BudgetDtoMapper.mapToIncomeDtos(budgetService.getIncomeByBudgetIdAndDate(budgetId, dateFrom, dateTo));
        List<ExpenseDto> expenseDtos = BudgetDtoMapper.mapToExpenseDtos(budgetService.getExpenseByBudgetIdAndDate(budgetId, dateFrom, dateTo));

        // Ustawiamy przychody w DTO budżetu
        budgetDto.setIncomes(incomeDtos);
        budgetDto.setExpenses(expenseDtos);

        return budgetDto;
    }



    //NIE DZIAŁA POPRAWNIE - LUB NIE UMIEM UZYWAC
    @PostMapping("/budgets")
    public Budget addBudget(@RequestBody Budget budget) {
        return budgetService.addBudget(budget);
    }

    @PutMapping("/budgets")
    public Budget editBudget(@RequestBody Budget budget) {
        return budgetService.editBudget(budget);
    }

    @DeleteMapping("/budgets/{id}")
    public void deleteBudget(@PathVariable long id) {
        budgetService.deleteBudget(id);
    }
}

