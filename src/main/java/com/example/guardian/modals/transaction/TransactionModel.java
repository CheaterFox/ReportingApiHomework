package com.example.guardian.modals.transaction;

import com.example.guardian.modals.acquirer.AcquirerModel;
import com.example.guardian.modals.client.Client;
import com.example.guardian.modals.fx.FxModel;
import com.example.guardian.modals.merchant.MerchantModel;
import com.example.guardian.modals.transactiondetail.TransactionDetailModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionModel {

    private FxModel fx;

    @JsonProperty("customerInfo")
    private Client client;

    private AcquirerModel acquirer;

    private MerchantModel merchant;

    @JsonProperty("transaction")
    private TransactionDetailModel transactionDetail;
}
