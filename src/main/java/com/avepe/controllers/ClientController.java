package com.avepe.controllers;

import com.avepe.models.Client;
import com.avepe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.http.MediaType.TEXT_HTML_VALUE;

@Controller
@RequestMapping("clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/{idClient}", produces = APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Client> getClientJson(@PathVariable Long idClient) {

        Client client = clientService.getClientById(idClient);
        System.out.println(client.getName());
        return new ResponseEntity<>(client, HttpStatus.OK) ;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveClient(Client client) {
        clientService.saveClient(client);
        return "redirect:clients/" + client.getIdClient();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String updateClient(Client client) {
        clientService.saveClient(client);
        return "redirect:clients/" + client.getIdClient();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idClient}", produces = TEXT_HTML_VALUE)
    public String getClientHtml(Model model, @PathVariable Long idClient) {
        Client client = clientService.getClientById(idClient);
        model.addAttribute("client", client);
        return "clients/show";
    }

    @RequestMapping(method = RequestMethod.GET, value = "new", produces = TEXT_HTML_VALUE)
    public String getClientHtml() {
        return "clients/new";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{idClient}/edit", produces = TEXT_HTML_VALUE)
    public String getClientHtmlEdit(Model model, @PathVariable Long idClient) {
        Client client = clientService.getClientById(idClient);
        model.addAttribute("client", client);
        return "clients/edit";
    }

    @RequestMapping(method = RequestMethod.GET, produces = TEXT_HTML_VALUE)
    public String getAllClientList(Model model, @RequestParam(value = "leachByName", required = false) String leachByName) {
        Iterable<Client> clients;

        if(leachByName != null) {
            clients = clientService.findByNameLike(leachByName);
        } else {
            clients = clientService.getAllClients();
        }

        model.addAttribute("clients", clients);
        return "clients/index";
    }
}