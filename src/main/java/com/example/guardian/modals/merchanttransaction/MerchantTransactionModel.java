package com.example.guardian.modals.merchanttransaction;

import com.example.guardian.modals.agent.AgentModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantTransactionModel {

    private String referenceNo;
    private Integer merchantId;
    private String status;
    private String channel;
    private String customData;
    private String chainId;
    private String agentInfoId;
    private String operation;
    private String fxTransactionId;
    private String updated_at;
    private String created_at;
    private Integer id;
    private Integer acquirerTransactionId;
    private String code;
    private String message;
    private String transactionId;
    private AgentModel agent;
}
