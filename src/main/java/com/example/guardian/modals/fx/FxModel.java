package com.example.guardian.modals.fx;


import com.example.guardian.modals.merchant.MerchantModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FxModel {

    @JsonProperty("merchant")
    @JsonIgnoreProperties(value = {"id", "name","referenceNo","status","customData",
            "type","operation","created_at","message",
            "transactionId","allowPartialRefund", "allowPartialCapture", "amount", "currency", "date", "code",
            "chainId", "paymentType", "token", "IPNUrl", "ipnType"})
    private MerchantModel fxMerchant;
}
