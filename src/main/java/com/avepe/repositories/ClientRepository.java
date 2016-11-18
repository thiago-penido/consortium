package com.avepe.repositories;

import com.avepe.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findByName(String name);
}