package com.penance.pfinance.api.v1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionListDTO {

    private List<TransactionDTO> transactionDTOList;

}
