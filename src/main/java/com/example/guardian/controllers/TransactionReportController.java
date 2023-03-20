package com.example.guardian.controllers;

import com.example.guardian.constants.ApiPathValues;
import com.example.guardian.dto.TransactionReportDto;
import com.example.guardian.resources.TransactionReportResource;
import com.example.guardian.resources.TransactionReportResponse;
import com.example.guardian.services.abstracts.TransactionReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@Validated
@RestController
@RequestMapping(ApiPathValues.REQUEST_BASE)
public class TransactionReportController {

    private final TransactionReportService transactionReportService;

    @Autowired
    public TransactionReportController(final TransactionReportService transactionReportService) {
        this.transactionReportService = transactionReportService;
    }

    @GetMapping("/" + ApiPathValues.TRANSACTION_REPORT)
    public ResponseEntity<TransactionReportResource> queryTransactionReport(@Valid @RequestBody TransactionReportDto transactionReportDto) {

        TransactionReportResponse transactionReportResponse = transactionReportService.queryTransactionReport(transactionReportDto);
        return ResponseEntity.status(HttpStatus.OK).body(new TransactionReportResource(transactionReportResponse));
    }
}
