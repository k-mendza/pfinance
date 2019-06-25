package com.penance.pfinance.repositories;

import com.penance.pfinance.model.Expense;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {

    Set<Expense> findAll();
}
