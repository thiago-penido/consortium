package com.avepe.controllers;

import com.avepe.models.Address;
import com.avepe.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(name = "address")
@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Address> saveAddress(Address address) {
        return new ResponseEntity<Address>(addressService.saveAddress(address), HttpStatus.OK);
    }
}