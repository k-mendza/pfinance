package com.penance.pfinance.model;

import lombok.*;
import org.hibernate.mapping.ToOne;

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
    @SequenceGenerator(name="expense_id_seq", sequenceName="expense_id_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="expense_id_seq")
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
    private ExpenseCategory category;

    @ManyToOne
    private ExpenseSubcategory subcategory;
}
