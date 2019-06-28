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
@Table(name = "expense")
public class Expense {

    @Id
    @Column(name = "id", columnDefinition = "NUMERIC(19,0)")
    @SequenceGenerator(name="seq", sequenceName="expense_id_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private Long id;

    @OneToOne
    @MapsId
    private AppUser appUser;

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
