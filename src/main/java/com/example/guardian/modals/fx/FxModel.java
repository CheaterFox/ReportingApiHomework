package com.example.guardian.modals.fx;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FxModel {

    @JsonProperty("merchant")
    private FxMerchantModel fxMerchant;
}
