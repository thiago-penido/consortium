package com.avepe.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Consortium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idConsortium;
    @ManyToOne
    Tire tire;
    @Column
    Date startDate;
    @Column
    Date endDate;
    @OneToMany(mappedBy = "consortium", orphanRemoval = true)
    List<ConsortiumItem> consortiumItems;
}