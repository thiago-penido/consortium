package com.avepe.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Client")
@Table(name = "Client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;
    String name;
    String socialName;
    String cpf;
    String fone;
    Date birthday;

}
