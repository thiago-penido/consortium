package com.avepe.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;
    @Column
    String name;
    @Column
    String socialName;
    @Column
    String cpf;
    @Column
    String fone;
    @Column
    Date birthday;
}