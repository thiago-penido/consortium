package com.avepe.repositories;

import com.avepe.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findByName(String name);
    List<Client> findByNameLike(String name);
}