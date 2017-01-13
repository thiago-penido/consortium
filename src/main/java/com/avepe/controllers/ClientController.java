package com.avepe.controllers;

import com.avepe.models.Client;
import com.avepe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Controller
@RequestMapping("client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Client> saveClient(Client client) {
        return new ResponseEntity<>(clientService.saveClient(client), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Client> getClientJson() {
        return new ResponseEntity<>(clientService.getClient(), HttpStatus.OK) ;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String getClientHtml(Model model) {
        model.addAttribute("client", clientService.getClient());
        return "client/show";
    }
}