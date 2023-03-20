package com.example.guardian.modals.transactionlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TransactionListRequestBody {
    private String fromDate;

    private String toDate;

    private String status;

    private String operation;

    private Integer merchantId;

    private Integer acquirerId;

    private String paymentMethod;

    private String errorCode;

    private String filterField;

    private String filterValue;

    private Integer page;
}
