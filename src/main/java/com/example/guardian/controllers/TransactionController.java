package com.example.guardian.controllers;

import com.example.guardian.constants.ApiPathValues;
import com.example.guardian.resources.TransactionResource;
import com.example.guardian.resources.TransactionResponse;
import com.example.guardian.services.abstracts.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPathValues.REQUEST_BASE)
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(final TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/" + ApiPathValues.TRANSACTION + "/" + "{transactionId}")
    public ResponseEntity<TransactionResource> queryTransaction(@PathVariable final String transactionId) {
        TransactionResponse transactionResponse = transactionService.queryTransaction(transactionId);
        return ResponseEntity.status(HttpStatus.OK).body(new TransactionResource(transactionResponse));
    }
}
