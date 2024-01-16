package com.example.mochamoneys.controller;


import org.springframework.web.bind.annotation.RestController;
//import org.springframework.hateoas.CollectionModel;
//import org.springframework.hateoas.EntityModel;


//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class BudgetController {
    /**public static final Long EMPTY_ID = null;

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping("/budget")
    public Budget getBudget(@PathVariable long id) {
        return budgetService.getBudget();
    }


    @GetMapping("/budgets")
    public CollectionModel<EntityModel<Budget>> getBudget() {
        List<EntityModel<Budget>> budget = budgetService.getBudgets().stream()
                .map(budget -> EntityModel.of(budget,
                        linkTo(methodOn(BudgetController.class).getBudget(budget.getBudgetId())).withSelfRel(),
                        linkTo(methodOn(BudgetController.class).gestBudgets()).withRel("budgets")
                ))
                .toList();
        return CollectionModel.of(budgets,
                linkTo(methodOn(BudgetController.class).getBudgets()).withSelfRel()
        );
    }

    @GetMapping("/budgets/{id}")
    public EntityModel<Budget> getBudget(@PathVariable Long id) {
        return EntityModel.of(budgetService.getBudget(id),
                linkTo(methodOn(BudgetController.class).getBudget(id)).withSelfRel(),
                linkTo(methodOn(BudgetController.class).getBudgets()).withRel("budgets"),
                linkTo(BudgetController.class).slash("budgets").slash(id).slash("deactivate")
                        .withRel("deactivate")
        );
    }

    @PostMapping("/budgets")
    public ResponseEntity<EntityModel<Budget>> createBudget(@RequestBody BudgetDto budgetDto) {
        Budget employee = budgetService.createBudget(new Budget(
                EMPTY_ID,
                budgetDto.getTitle()
        ));
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(EntityModel.of(employee,
                        linkTo(methodOn(BudgetController.class).createBudget(budgetDto)).withSelfRel(),
                        linkTo(methodOn(BudgetController.class).getBudgets()).withRel("budgets"),
                        linkTo(BudgetController.class).slash("budgets").slash(employee.getBudgetId()).slash("deactivate")
                                .withRel("deactivate")
                ));

    }

    @PutMapping("/budgets/{id}")
    public ResponseEntity<Object> updateBudget(@PathVariable Long id, @RequestBody BudgetDto budgetDto) {
        employeeService.updateBudget(new Budget(
                id,
                budgetDto.getTitle()
        ));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/budgets/{id}")
    public ResponseEntity<Object> deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/budgets/{id}/deactivate")
    public void deactivateBudget(@PathVariable Long id) {
**/
    }


