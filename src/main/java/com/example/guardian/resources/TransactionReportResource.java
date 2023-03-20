package com.example.guardian.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionReportResource {

    @JsonProperty("transactionReport")
    private TransactionReportResponse transactionReportResponse;

    public TransactionReportResource(final TransactionReportResponse transactionReportResponse) {
        this.transactionReportResponse = transactionReportResponse;
    }

    @Override
    public String toString() {
        return "TransactionReportResource{" +
                "transactionReportResponse=" + transactionReportResponse +
                '}';
    }
}
