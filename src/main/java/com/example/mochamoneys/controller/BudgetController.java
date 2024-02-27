package com.example.mochamoneys.controller;

import com.example.mochamoneys.controller.dto.BudgetDto;
import com.example.mochamoneys.controller.dto.IncomeDto;
import com.example.mochamoneys.controller.mapper.BudgetDtoMapper;
import com.example.mochamoneys.controller.mapper.IncomeDtoMapper;
import com.example.mochamoneys.model.Budget;
import com.example.mochamoneys.service.BudgetService;
import com.example.mochamoneys.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BudgetController {

    private final BudgetService budgetService;
//    @GetMapping("budgets")
//    public List<BudgetDto> getBudget(@RequestParam(required = false) Integer page, Sort.Direction sort) {
//        int pageNumber = page != null && page >= 0 ? page : 0;
//        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
//        return BudgetDtoMapper.mapToBudgetDtos(budgetService.getBudgets(pageNumber, sortDirection));
//    }
//

    @GetMapping("budget/{userId}")
    public BudgetDto getBudget(@PathVariable Long userId) {

        Budget budget = budgetService.getBudgetByUserId(userId);
        BudgetDto budgetDto = BudgetDtoMapper.mapToBudgetDto(budget);
        Long budgetId = budgetService.getBudgetIdByUserId(userId);

        // Pobieramy przychody i dodajemy je do odpowiadającego DTO
        List<IncomeDto> incomeDtos = budgetDto.getIncomesForBudget(budgetId);

        // Ustawiamy przychody w DTO budżetu
        if (budgetDto.getBudgetId() == budget.getBudgetId()) {
            budgetDto.setIncomes(incomeDtos);
        }
        return budgetDto;
    }


    @GetMapping("/budgetnew/{userId}")
    public List<Object[]> findBudgetAndIncomeDetailsByUserId(@PathVariable Long userId){
        List<Object[]> income = budgetService.findBudgetAndIncomeDetailsByUserId(userId);
        return income;
    }




//    @GetMapping("/budgets/data")
//    public List<Budget> getBudgetsWithData(@RequestParam(required = false) Integer page, Sort.Direction sort) {
//        int pageNumber = page != null && page >= 0 ? page : 0;
//        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
//        return budgetService.getBudgetsWithData(pageNumber, sortDirection);
//    }

//    @GetMapping("/budgets/{id}")
//    public BudgetDto getSingleBudget(@PathVariable long id) {
//        var budgetId = id != 0 ? id : 1;
//        Budget budget = budgetService.getSingleBudget(budgetId);
//        BudgetDto budgetDto = BudgetDtoMapper.mapToBudgetDto(budget);
//
//        // Pobieramy przychody dla danego budżetu i mapujemy je na DTO
//        List<IncomeDto> incomesForBudget = budgetDto.getIncomesForBudget(budgetId);
//        // Ustawiamy przychody w DTO budżetu
//        budgetDto.setIncomes(incomesForBudget);
//
//        return budgetDto;
//    }



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

