package com.penance.pfinance.controllers;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.services.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<ExpenseDTO>> getAllExpenses(){
        List<ExpenseDTO> dtoList = expenseService.getAllExpenses();
        return new ResponseEntity<>( dtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpenseDTO> getExpenseById(@PathVariable Long id){
        return new ResponseEntity<>(expenseService.getExpenseById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long id){

        expenseService.deleteExpenseById(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
