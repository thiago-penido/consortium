package com.avepe.repositories;

import com.avepe.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ClientRepository{ //extends CrudRepository {

    public Client findByName(String name);
}
