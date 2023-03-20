package com.example.guardian.resources;

import com.example.guardian.modals.acquirer.AcquirerModel;
import com.example.guardian.modals.client.Client;
import com.example.guardian.modals.fx.FxModel;
import com.example.guardian.modals.merchant.MerchantModel;
import com.example.guardian.modals.transactiondetail.TransactionDetailModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class TransactionResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 5927096747581104485L;

    private FxModel fx;

    private Client client;

    private AcquirerModel acquirer;

    private MerchantModel merchant;

    private TransactionDetailModel transactionDetail;

    public TransactionResponse(FxModel fxModel, Client client, AcquirerModel acquirerModel, MerchantModel merchantModel, TransactionDetailModel transactionDetailModel) {
        this.fx = fxModel;
        this.client = client;
        this.acquirer = acquirerModel;
        this.merchant = merchantModel;
        this.transactionDetail = transactionDetailModel;
    }

    @Override
    public String toString() {
        return "TransactionResponse{" +
                "fx=" + fx +
                ", client=" + client +
                ", acquirer=" + acquirer +
                ", merchant=" + merchant +
                ", transactionDetail=" + transactionDetail +
                '}';
    }
}
