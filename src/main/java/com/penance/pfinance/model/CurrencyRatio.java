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
@Table(name = "currency_ratio")
public class CurrencyRatio {

    @Id
    @Column(name = "id", columnDefinition = "NUMERIC(19,0)")
    @SequenceGenerator(name="currency_ratio_id_seq", sequenceName="currency_ratio_id_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="currency_ratio_id_seq")
    private Long id;

    @NotNull
    @Column(name = "pair")
    private String pair;

    @NotNull
    @Column(name = "ratio", columnDefinition = "NUMERIC(19,2)")
    private Float ratio;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private LocalDate creationDate;
}
