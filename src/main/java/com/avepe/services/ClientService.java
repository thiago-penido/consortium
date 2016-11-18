package com.avepe.services;

import com.avepe.models.Client;
import com.avepe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Client getClient() {
        return clientRepository.findAll().iterator().next();
    }
}