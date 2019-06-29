package com.penance.pfinance.api.mappers;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.model.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExpenseMapper {

    ExpenseMapper INSTANCE = Mappers.getMapper(ExpenseMapper.class);

    @Mapping(source = "id", target = "id")
    ExpenseDTO expenseToExpenseDTO(Expense expense);
}
