package com.penance.pfinance.api.v1.mappers;

import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {

    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    @Mapping(source = "transaction.appUser.email", target = "appUserDTO.email")
    @Mapping(source = "transaction.payee.name", target = "payeeName")
    @Mapping(source = "transaction.paySource.name", target = "paySourceName")
    @Mapping(source = "transaction.currency", target = "currencyDTO")
    @Mapping(source = "transaction.category.name", target = "categoryName")
    @Mapping(source = "transaction.subcategory.name", target = "subcategoryName")
    TransactionDTO transactionToTransactionDTO(Transaction transaction);

    @Mapping(source = "transactionDTO.appUserDTO.email", target = "appUser.email")
    Transaction transactionDTOToTransaction(TransactionDTO transactionDTO);
}
