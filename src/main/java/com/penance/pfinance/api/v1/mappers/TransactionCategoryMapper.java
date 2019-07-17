package com.penance.pfinance.api.v1.mappers;

import com.penance.pfinance.api.v1.DTO.TransactionCategoryDTO;
import com.penance.pfinance.model.TransactionCategory;
import org.mapstruct.factory.Mappers;

public interface TransactionCategoryMapper {

    TransactionCategoryMapper INSTANCE = Mappers.getMapper(TransactionCategoryMapper.class);

    TransactionCategoryDTO transactionCategoryToTransactionCategoryDTO(TransactionCategory transactionCategory);

    TransactionCategory transactionCategoryDTOToTransactionCategory(TransactionCategoryDTO transactionCategoryDTO);
}
