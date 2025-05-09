package com.neepanklok.controllers;

import com.neepanklok.entities.Client;
import com.neepanklok.sevices.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client){
        System.out.println(client);
        return new ResponseEntity<>(clientService.createClient(client),
                HttpStatus.CREATED);
    }
}
