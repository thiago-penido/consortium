package com.avepe.controllers;

import com.avepe.models.Client;
import com.avepe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Controller
@RequestMapping("clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView saveClient(Client client) {
        clientService.saveClient(client);
        return new ModelAndView("redirect:"+ "/clients/" + client.getIdClient());
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/{idClient}", produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Client> getClientJson(@PathVariable Long idClient) {

        Client client = clientService.getClientById(idClient);
        System.out.println(client.getName());
        return new ResponseEntity<>(client, HttpStatus.OK) ;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idClient}", produces = MediaType.TEXT_HTML_VALUE)
    public String getClientHtml(Model model, @PathVariable Long idClient) {
        Client client = clientService.getClientById(idClient);
        System.out.println(client.getName());
        model.addAttribute("client", client);
        return "clients/show";
    }


    @RequestMapping(method = RequestMethod.GET, value = "new", produces = MediaType.TEXT_HTML_VALUE)
    public String getClientHtml() {
        return "clients/new";
    }
}