package com.avepe.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class ConsortiumItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idConsortiumItem;
    @ManyToOne
    Client client;
    @ManyToOne
    Consortium consortium;
    @Column
    Date payDay;
    @Column
    Date dueDay;
}