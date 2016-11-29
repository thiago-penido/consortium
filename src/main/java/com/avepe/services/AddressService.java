package com.avepe.services;

import com.avepe.models.Address;
import com.avepe.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public void removeAddress(Address address) {
        addressRepository.delete(address);
    }
}
