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
@Table(name = "transaction_subcategory")
public class TransactionSubcategory {

    @Id
    @Column(name = "id", columnDefinition = "NUMERIC(19,0)")
    @SequenceGenerator(name="transaction_subcategory_id_seq", sequenceName="transaction_subcategory_id_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="transaction_subcategory_id_seq")
    private Long id;

    @NotNull
    @Column(name = "category_id", columnDefinition = "NUMERIC(19,0)")
    private Long category_id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private LocalDate creationDate;
}
