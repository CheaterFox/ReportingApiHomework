package com.example.guardian.modals.transaction;


import com.example.guardian.modals.acquirer.AcquirerModel;
import com.example.guardian.modals.client.CustomerInfoModel;
import com.example.guardian.modals.fx.FxModel;
import com.example.guardian.modals.ipn.IpnModel;
import com.example.guardian.modals.merchant.MerchantModel;
import com.example.guardian.modals.transactiondetail.TransactionDetailModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionModel {

    private FxModel fx;

    private String updated_at;
    private String created_at;

    private Boolean refundable;

    @JsonProperty("customerInfo")
    @JsonIgnoreProperties(value = {"id", "created_at", "updated_at", "deleted_at",
            "expiryMonth", "expiryYear", "startMonth", "startYear", "issueNumber", "birthday", "gender", "billingTitle",
            "billingCompany", "billingAddress1", "billingAddress2", "billingCity", "billingPostcode", "billingState",
            "billingCountry", "billingPhone", "billingFax", "shippingTitle", "shippingFirstName", "shippingLastName",
            "shippingCompany", "shippingAddress1", "shippingAddress2", "shippingCity", "shippingPostcode", "shippingState",
            "shippingCountry", "shippingPhone", "shippingFax", "token",})
    private CustomerInfoModel customerInfo;

    private AcquirerModel acquirer;

    @JsonProperty("merchant")
    @JsonIgnoreProperties(value = {"originalAmount", "originalCurrency", "convertedAmount", "convertedCurrency",
            "referenceNo", "status", "customData", "type", "operation", "created_at", "message", "transactionId", "amount", "currency",
            "date", "code", "chainId", "paymentType", "token", "IPNUrl", "ipnType"})
    private MerchantModel merchant;

    @JsonProperty("transaction")
    private TransactionDetailModel transactionDetail;

    private IpnModel ipn;
}

