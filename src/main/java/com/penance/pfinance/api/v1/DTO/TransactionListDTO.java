package com.penance.pfinance.api.v1.DTO;

import lombok.Data;

import java.util.List;

@Data
public class TransactionListDTO {

    private List<TransactionDTO> transactionDTOList;

}
