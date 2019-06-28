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
@Table(name = "currency")
public class Currency {

    @Id
    @Column(name = "id", columnDefinition = "NUMERIC(19,0)")
    @SequenceGenerator(name="seq", sequenceName="currency_id_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private LocalDate creationDate;
}
