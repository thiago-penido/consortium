package com.avepe.services;

import com.avepe.models.Tire;
import com.avepe.repositories.TireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TireService {

    @Autowired
    TireRepository tireRepository;

    public Tire saveTire(Tire tire) {
        return tireRepository.save(tire);
    }

    public void deleteTire (Long idTire) {
        tireRepository.delete(idTire);
    }
}