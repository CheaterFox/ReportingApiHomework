package com.example.guardian.modals.ipn;

import com.example.guardian.modals.merchant.MerchantModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IpnModel {
    private boolean sent;
    @JsonProperty("merchant")
    @JsonIgnoreProperties(value = {"id", "name","originalAmount", "originalCurrency", "created_at",
            "allowPartialRefund", "allowPartialCapture"})
    private MerchantModel merchant;
}
