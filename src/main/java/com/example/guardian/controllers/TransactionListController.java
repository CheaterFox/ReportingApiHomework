package com.example.guardian.controllers;

import com.example.guardian.constants.ApiPathValues;
import com.example.guardian.dto.TransactionListDto;
import com.example.guardian.resources.TransactionListResource;
import com.example.guardian.resources.TransactionListResponse;
import com.example.guardian.services.abstracts.TransactionListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(ApiPathValues.REQUEST_BASE)
public class TransactionListController {

    private final TransactionListService transactionListService;

    public TransactionListController(final TransactionListService transactionListService) {
        this.transactionListService = transactionListService;
    }

    @GetMapping("/" + ApiPathValues.TRANSACTION_LIST)
    public ResponseEntity<TransactionListResource>  queryTransactionList(@RequestBody TransactionListDto transactionListDto, @RequestParam Optional<Integer> page){
        TransactionListResponse transactionListResponse = transactionListService. queryTransactionList(transactionListDto, page);
        return  ResponseEntity.status(HttpStatus.OK).body(new TransactionListResource(transactionListResponse));
    }
}
