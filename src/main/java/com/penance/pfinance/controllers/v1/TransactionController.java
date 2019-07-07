package com.penance.pfinance.controllers.v1;

import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.model.Transaction;
import com.penance.pfinance.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/transactions")
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<List<TransactionDTO>> getAllTransactions(){
        List<TransactionDTO> dtoList = transactionService.getAllTransactions();
        return new ResponseEntity<>( dtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> getTransactionById(@PathVariable Long id){
        return new ResponseEntity<>(transactionService.getTransactionById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long id){

        transactionService.deleteTransactionById(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TransactionDTO> createNewTransaction(@RequestBody TransactionDTO transactionDTO){
        return new ResponseEntity<>(transactionService.createNewTransaction(transactionDTO), HttpStatus.CREATED);
    }

}
