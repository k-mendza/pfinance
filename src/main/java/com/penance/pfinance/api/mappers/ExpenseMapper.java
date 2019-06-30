package com.penance.pfinance.api.mappers;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.model.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExpenseMapper {

    ExpenseMapper INSTANCE = Mappers.getMapper(ExpenseMapper.class);

    @Mapping(source = "expense.appUser.email", target = "appUserLogin")
    @Mapping(source = "expense.payee.name", target = "payeeName")
    @Mapping(source = "expense.paySource.name", target = "paySourceName")
    @Mapping(source = "expense.currency.id", target = "currencyId")
    @Mapping(source = "expense.category.name", target = "categoryName")
    @Mapping(source = "expense.subcategory.name", target = "subcategoryName")
    ExpenseDTO expenseToExpenseDTO(Expense expense);
}
