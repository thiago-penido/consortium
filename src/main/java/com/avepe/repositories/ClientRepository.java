package com.avepe.repositories;

import com.avepe.models.Client;

//@Repository
public interface ClientRepository{ //extends CrudRepository {

    public Client findByName(String name);
}
