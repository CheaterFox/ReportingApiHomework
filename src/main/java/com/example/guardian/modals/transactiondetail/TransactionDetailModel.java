package com.example.guardian.modals.transactiondetail;


import com.example.guardian.modals.merchanttransaction.MerchantTransactionModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDetailModel {

    @JsonProperty("merchant")
    private MerchantTransactionModel merchantTransaction;
}
