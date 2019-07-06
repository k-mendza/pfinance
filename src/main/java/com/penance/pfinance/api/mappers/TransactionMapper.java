package com.penance.pfinance.api.mappers;

import com.penance.pfinance.api.DTO.TransactionDTO;
import com.penance.pfinance.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {

    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    @Mapping(source = "transaction.appUser.email", target = "appUserLogin")
    @Mapping(source = "transaction.payee.name", target = "payeeName")
    @Mapping(source = "transaction.paySource.name", target = "paySourceName")
    @Mapping(source = "transaction.currency.id", target = "currencyId")
    @Mapping(source = "transaction.category.name", target = "categoryName")
    @Mapping(source = "transaction.subcategory.name", target = "subcategoryName")
    TransactionDTO transactionToTransactionDTO(Transaction transaction);
}
