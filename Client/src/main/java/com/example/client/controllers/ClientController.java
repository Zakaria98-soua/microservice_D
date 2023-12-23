package com.example.client.controllers;

import com.example.client.entities.Client;
import com.example.client.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {
    @Autowired
    private ClientService Service;

    @GetMapping
    public List<Client> findAll() {
        return Service.findAll();
    }
    @GetMapping("/{id}")
    public Client findById(@PathVariable Long id) throws Exception {
        return Service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Client client) {
        Service.addClient(client);
    }

}
