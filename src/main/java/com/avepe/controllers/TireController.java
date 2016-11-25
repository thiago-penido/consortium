package com.avepe.controllers;

import com.avepe.models.Tire;
import com.avepe.services.TireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tire")
public class TireController {

    @Autowired
    TireService tireService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Tire> saveTire(Tire tire) {
        return new ResponseEntity<>(tireService.saveTire(tire), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idTire}")
    public ResponseEntity<HttpStatus> deleteTire(@PathVariable Long idTire) {
        tireService.deleteTire(idTire);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}