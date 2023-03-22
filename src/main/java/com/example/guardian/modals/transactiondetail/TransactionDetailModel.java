package com.example.guardian.modals.transactiondetail;


import com.example.guardian.modals.merchant.MerchantModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDetailModel {

    @JsonProperty("merchant")
    @JsonIgnoreProperties(value = {"id", "name", "originalAmount", "originalCurrency",
            "convertedAmount", "convertedCurrency", "allowPartialRefund", "allowPartialCapture", "amount", "currency", "date", "code",
            "chainId", "paymentType", "token", "IPNUrl", "ipnType"})
    private MerchantModel merchantTransaction;
}
