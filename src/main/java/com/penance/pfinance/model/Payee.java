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
@Table(name = "payee")
public class Payee {

    @Id
    @Column(name = "id", columnDefinition = "NUMERIC(19,2)")
    @SequenceGenerator(name="seq", sequenceName="payee_id_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private LocalDate creationDate;

}