package com.example.guardian.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@JsonTypeName("transactionList")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
@Data
public class TransactionListDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -1559159968753228721L;

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
