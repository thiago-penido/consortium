package com.avepe.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class ClientController {

    @RequestMapping(method = RequestMethod.GET)
    public String saveClient() {
        return "batata";
    }

    @RequestMapping(value = "batata", method = RequestMethod.GET)
    public void updateClient() {

    }
}
