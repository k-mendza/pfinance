package com.penance.pfinance.api.v1.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionDTO {

    private Long id;

    private AppUserDTO appUserDTO;

    private String payeeName;

    private String paySourceName;

    private String title;

    private String description;

    private Float amount;

    private String currencyId;

    private LocalDate paymentDate;

    private LocalDate creationDate;

    private String categoryName;

    private String subcategoryName;

    private String transactionUrl;
}
