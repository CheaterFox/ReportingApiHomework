package com.example.guardian.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionListResource {

    @JsonProperty("transactionList")
    private TransactionListResponse transactionListResponse;

    public TransactionListResource( final TransactionListResponse transactionListResponse) {
        this.transactionListResponse = transactionListResponse;
    }

    @Override
    public String toString() {
        return "TransactionListResource{" +
                "transactionListResponse=" + transactionListResponse +
                '}';
    }
}
