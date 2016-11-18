package com.avepe.controllers;

import com.avepe.models.Client;
import com.avepe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Long> saveClient(Client client) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Client> getClient() {
        return new ResponseEntity<Client>(clientService.getClient(), HttpStatus.OK) ;
    }
}