package com.example.guardian.services.abstracts;

import com.example.guardian.resources.TransactionResponse;

public interface TransactionService {

    TransactionResponse queryTransaction(String transactionId);
}
