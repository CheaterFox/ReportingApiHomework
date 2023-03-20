package com.example.guardian.modals.fx;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FxMerchantModel {

    private Integer originalAmount;
    private String originalCurrency;
    private Integer convertedAmount;
    private String convertedCurrency;

}
