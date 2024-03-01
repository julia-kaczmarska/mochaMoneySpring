package com.example.mochamoneys.controller.mapper;
import com.example.mochamoneys.controller.dto.*;
import com.example.mochamoneys.model.*;
import java.util.List;
import java.util.stream.Collectors;

public class BudgetDtoMapper {
    private BudgetDtoMapper() {
    }

    public static List<BudgetDto> mapToBudgetDtos(List<Budget> budgets) {
        return budgets.stream()
                .map(BudgetDtoMapper::mapToBudgetDto)
                .collect(Collectors.toList());
    }

    public static BudgetDto mapToBudgetDto(Budget budget) {
        // Assuming Budget has a method to get a list of Income objects
        List<IncomeDto> incomeDtos = budget.getIncomes().stream()
                .map(BudgetDtoMapper::mapToIncomeDto)
                .collect(Collectors.toList());

        List<ExpenseDto> expenseDtos = budget.getExpenses().stream()
                .map(BudgetDtoMapper::mapToExpenseDto)
                .collect(Collectors.toList());

        return BudgetDto.builder()
//                .budgetId(budget.getBudgetId())
                .incomes(incomeDtos)
                .expenses(expenseDtos)
                .build();
    }

    public static List<IncomeDto> mapToIncomeDtos(List<Income> incomes) {
        return incomes.stream()
                .map(BudgetDtoMapper::mapToIncomeDto)
                .collect(Collectors.toList());
    }

    private static IncomeDto mapToIncomeDto(Income income) {
        CategoryincDto categoryinc = mapToCategoryincDto(income.getCategoryinc());
        return IncomeDto.builder()
                .incomeId(income.getIncomeId())
                .amount(income.getAmount())
                .date(income.getDate())
                .categoryinc(categoryinc)
                .build();
    }

    public static List<ExpenseDto> mapToExpenseDtos(List<Expense> expenses) {
        return expenses.stream()
                .map(BudgetDtoMapper::mapToExpenseDto)
                .collect(Collectors.toList());
    }

    private static ExpenseDto mapToExpenseDto(Expense expenses) {
        CategoryexpDto categoryexp = mapToCategoryexpDto(expenses.getCategoryexp());
        return ExpenseDto.builder()
                .expenseId(expenses.getExpenseId())
                .amount(expenses.getAmount())
                .date(expenses.getDate())
                .categoryexp(categoryexp)
                .build();
    }

    private static CategoryincDto mapToCategoryincDto(Categoryinc categoryinc) {
        return CategoryincDto.builder()
                .title(categoryinc.getTitle())
                .build();
    }

    private static CategoryexpDto mapToCategoryexpDto(Categoryexp categoryexp) {
        return CategoryexpDto.builder()
                .title(categoryexp.getTitle())
                .build();
    }
}