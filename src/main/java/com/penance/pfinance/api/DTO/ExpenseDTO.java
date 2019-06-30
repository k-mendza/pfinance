package com.penance.pfinance.api.DTO;

import com.penance.pfinance.model.ExpenseCategory;
import com.penance.pfinance.model.ExpenseSubcategory;
import lombok.Data;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
public class ExpenseDTO {

    private Long id;

    private String appUserLogin;

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
}
