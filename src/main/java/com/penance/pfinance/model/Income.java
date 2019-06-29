package com.penance.pfinance.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "income")
public class Income {

    @Id
    @Column(name = "id", columnDefinition = "NUMERIC(19,0)")
    @SequenceGenerator(name="income_id_seq", sequenceName="income_id_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="income_id_seq")
    private Long id;

    @Column(name = "app_user_id")
    private Long appUserId;

    @Column(name = "payee_id")
    private Long payeeId;

    @Column(name = "pay_source_id")
    private Long paySourceId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "amount", columnDefinition = "NUMERIC(19,2)")
    private Float amount;

    @Column(name = "currency_id")
    private String currencyId;

    @Column(name = "payment_date", columnDefinition = "TIMESTAMP")
    private LocalDate paymentDate;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private LocalDate creationDate;

    @Column(name = "category_id", columnDefinition = "NUMERIC(19,0)")
    @NotNull
    private Long categoryId;

    @Column(name = "subcategory_id", columnDefinition = "NUMERIC(19,0)")
    @NotNull
    private Long subcategoryId;
}
