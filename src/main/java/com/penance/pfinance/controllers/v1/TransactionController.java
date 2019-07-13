package com.penance.pfinance.controllers.v1;

import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.api.v1.DTO.TransactionListDTO;
import com.penance.pfinance.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(TransactionController.BASE_URL)
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController {

    public static final String BASE_URL = "/api/v1/transactions";

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public TransactionListDTO getAllTransactions(){
        TransactionListDTO transactionListDTO = new TransactionListDTO();
        transactionListDTO.setTransactionDTOList(transactionService.getAllTransactions());
        return transactionListDTO ;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TransactionDTO getTransactionById(@PathVariable Long id){
        TransactionDTO transactionDTO = transactionService.getTransactionById(id);
        return transactionDTO;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTransaction(@PathVariable Long id){

        transactionService.deleteTransactionById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TransactionDTO createNewTransaction(@RequestBody TransactionDTO transactionDTO){
        TransactionDTO createdTransaction = transactionService.createNewTransaction(transactionDTO);
        return createdTransaction;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TransactionDTO updateTransaction(@PathVariable Long id, @RequestBody TransactionDTO transactionDTO){
        TransactionDTO updatedTransactionDTO = transactionService.saveTransactionByDTO(id ,transactionDTO);
        return updatedTransactionDTO;
    }
}
