package com.avepe.models;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "Client")
public class Client implements Serializable {

    String name;
    String socialName;
    String cpf;
    String fone;
    Date birthday;

}
