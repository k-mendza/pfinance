package com.penance.pfinance.api.v1.DTO;

import lombok.Data;

@Data
public class TransactionCategoryDTO {

    private Long id;

    private String name;

    private String description;
}
