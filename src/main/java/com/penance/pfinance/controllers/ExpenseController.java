package com.penance.pfinance.controllers;

import com.penance.pfinance.model.Expense;
import com.penance.pfinance.services.ExpenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/getAll")
    public Iterable<Expense> getAllTransactions() {
        return expenseService.findAll();
    }
}
