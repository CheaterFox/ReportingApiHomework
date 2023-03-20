package com.example.guardian.converters;

import com.example.guardian.modals.transaction.TransactionModel;
import com.example.guardian.resources.TransactionResponse;
import org.springframework.stereotype.Component;

@Component
public class TransactionConverter {
    public TransactionResponse convertTransaction(final TransactionModel transactionModel) {
        TransactionResponse transactionResponse = new TransactionResponse(
                transactionModel.getFx(),
                transactionModel.getClient(),
                transactionModel.getAcquirer(),
                transactionModel.getMerchant(),
                transactionModel.getTransactionDetail()
        );

        return transactionResponse;
    }
}
