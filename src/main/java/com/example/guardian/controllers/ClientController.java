package com.example.guardian.controllers;

import com.example.guardian.constants.ApiPathValues;
import com.example.guardian.resources.ClientResource;
import com.example.guardian.resources.ClientResponse;
import com.example.guardian.services.abstracts.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPathValues.REQUEST_BASE)
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(final ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/" + ApiPathValues.CLIENT + "/" + "{transactionId}")
    public ResponseEntity<ClientResource> queryClient(@PathVariable final String transactionId) {
        ClientResponse clientResponse = clientService.queryClient(transactionId);
        return ResponseEntity.status(HttpStatus.OK).body(new ClientResource(clientResponse));
    }
}
