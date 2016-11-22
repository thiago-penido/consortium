package com.avepe.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAddress;
    @Column
    String street;
    @Column
    Integer number;
    @Column
    String state;
    @Column
    String neighborhood;
}