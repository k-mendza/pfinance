package com.penance.pfinance.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trans")
public class TransactionController {

    @RequestMapping("/getAll")
    public String getAllTransactions() {
        return "Transactions";
    }
}
