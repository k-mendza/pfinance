package com.penance.pfinance.controllers;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.services.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/expenses/")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public ResponseEntity<List<ExpenseDTO>> getAllExpenses(){
        List<ExpenseDTO> dtoList = expenseService.getAllExpenses();
        return new ResponseEntity<>( dtoList, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ExpenseDTO> getExpenseById(@PathVariable Long id){
        return new ResponseEntity<>(expenseService.getExpenseById(id), HttpStatus.OK);
    }
}
