package com.example.guardian.converters;

import com.example.guardian.modals.transaction.TransactionModel;
import com.example.guardian.resources.TransactionResponse;
import org.springframework.stereotype.Component;

@Component
public class TransactionConverter {
    public TransactionResponse convertTransaction(final TransactionModel transactionModel) {
        TransactionResponse transactionResponse = new TransactionResponse(
                transactionModel.getFx(),
                transactionModel.getUpdated_at(),
                transactionModel.getCreated_at(),
                transactionModel.getRefundable(),
                transactionModel.getCustomerInfo(),
                transactionModel.getAcquirer(),
                transactionModel.getMerchant(),
                transactionModel.getTransactionDetail(),
                transactionModel.getIpn()
        );

        return transactionResponse;
    }
}
