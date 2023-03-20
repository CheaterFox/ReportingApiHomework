package com.example.guardian.converters;

import com.example.guardian.modals.transactionlist.TransactionList;
import com.example.guardian.resources.TransactionListResponse;

import org.springframework.stereotype.Component;

@Component
public class TransactionListConverter {

    public TransactionListResponse convertTransactionList(final TransactionList transactionList) {
        TransactionListResponse transactionListResponse = new TransactionListResponse(
                transactionList.getPer_page(),
                transactionList.getCurrent_page(),
                transactionList.getNext_page_url(),
                transactionList.getPrev_page_url(),
                transactionList.getFrom(),
                transactionList.getTo(),
                transactionList.getData()
        );

        return transactionListResponse;
    }
}
