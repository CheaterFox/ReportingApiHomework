package com.example.guardian.resources;

import com.example.guardian.modals.acquirer.AcquirerModel;
import com.example.guardian.modals.client.CustomerInfoModel;
import com.example.guardian.modals.fx.FxModel;
import com.example.guardian.modals.ipn.IpnModel;
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

    private String updated_at;
    private String created_at;

    private Boolean refundable;

    private CustomerInfoModel customerInfo;

    private AcquirerModel acquirer;

    private MerchantModel merchant;

    private TransactionDetailModel transactionDetail;

    private IpnModel ipn;

    public TransactionResponse(FxModel fx, String updated_at, String created_at, Boolean refundable, CustomerInfoModel customerInfo, AcquirerModel acquirer, MerchantModel merchant, TransactionDetailModel transactionDetail, IpnModel ipn) {
        this.fx = fx;
        this.updated_at = updated_at;
        this.created_at = created_at;
        this.refundable = refundable;
        this.customerInfo = customerInfo;
        this.acquirer = acquirer;
        this.merchant = merchant;
        this.transactionDetail = transactionDetail;
        this.ipn = ipn;
    }

    @Override
    public String toString() {
        return "TransactionResponse{" +
                "fx=" + fx +
                ", updated_at='" + updated_at + '\'' +
                ", created_at='" + created_at + '\'' +
                ", refundable=" + refundable +
                ", customerInfo=" + customerInfo +
                ", acquirer=" + acquirer +
                ", merchant=" + merchant +
                ", transactionDetail=" + transactionDetail +
                ", ipn=" + ipn +
                '}';
    }
}