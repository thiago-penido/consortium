package com.avepe.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Tire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idTire;
    @Column
    String description;
    @Column
    String type;
    @Column
    Double price;
}