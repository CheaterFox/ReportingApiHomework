package com.example.guardian.modals.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantModel {

    private long id;
    private String name;
    private long originalAmount;
    private String originalCurrency;
    private long convertedAmount;
    private String convertedCurrency;
    private String referenceNo;
    private String status;
    private String customData;
    private String type;
    private String operation;
    private String created_at;
    private String message;
    private String transactionId;
    private boolean allowPartialRefund;
    private boolean allowPartialCapture;
    private long amount;
    private String currency;
    private String date;
    private String code;
    private String chainId;
    private String paymentType;
    private String token;
    @JsonProperty("IPNUrl")
    private String iPNUrl;
    private String ipnType;

}
