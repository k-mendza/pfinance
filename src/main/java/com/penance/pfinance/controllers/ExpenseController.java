package com.penance.pfinance.controllers;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.api.DTO.ExpenseListDTO;
import com.penance.pfinance.services.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/expenses/")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public ResponseEntity<ExpenseListDTO> getAllExpenses(){
        return new ResponseEntity<>(
                new ExpenseListDTO(expenseService.getAllExpenses()), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ExpenseDTO> getExpenseById(@PathVariable Long id){
        return new ResponseEntity<>(expenseService.getExpenseById(id), HttpStatus.OK);
    }
}
