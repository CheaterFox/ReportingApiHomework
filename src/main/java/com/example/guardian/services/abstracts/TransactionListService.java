package com.example.guardian.services.abstracts;

import com.example.guardian.dto.TransactionListDto;
import com.example.guardian.resources.TransactionListResponse;

import java.util.Optional;

public interface TransactionListService {
    TransactionListResponse  queryTransactionList(TransactionListDto transactionListDto, Optional<Integer> page);
}
