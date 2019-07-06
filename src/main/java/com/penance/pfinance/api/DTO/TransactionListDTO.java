package com.penance.pfinance.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TransactionListDTO {

    List<TransactionDTO> transactions;

}
