package com.example.guardian.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransactionResource {

    @JsonProperty("transaction")
    private TransactionResponse transactionResponse;

    public TransactionResource(final TransactionResponse transactionResponse) {
        this.transactionResponse = transactionResponse;
    }

    @Override
    public String toString() {
        return "TransactionResource{" +
                "transactionResponse=" + transactionResponse +
                '}';
    }
}
