package com.penance.pfinance.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @Column(name = "id", columnDefinition = "NUMERIC(19,0)")
    @SequenceGenerator(name="transaction_id_seq", sequenceName="transaction_id_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="transaction_id_seq")
    private Long id;

    @ManyToOne
    private AppUser appUser;

    @ManyToOne
    private Payee payee;

    @ManyToOne
    private PaySource paySource;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "amount", columnDefinition = "NUMERIC(19,2)")
    private Float amount;

    @ManyToOne
    private Currency currency;

    @Column(name = "payment_date", columnDefinition = "TIMESTAMP")
    private LocalDate paymentDate;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private LocalDate creationDate;

    @ManyToOne
    private TransactionCategory category;

    @ManyToOne
    private TransactionSubcategory subcategory;
}
