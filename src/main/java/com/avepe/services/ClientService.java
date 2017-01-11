package com.avepe.services;

import com.avepe.models.Client;
import com.avepe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    @ModelAttribute("client")
    public Client getClient() {
        return clientRepository.findAll().iterator().next();
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
}