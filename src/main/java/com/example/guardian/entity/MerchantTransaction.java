package com.example.guardian.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "merchant_transaction")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MerchantTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String referenceNo;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    private String status;
    private String channel;
    private String customData;
    private String chainId;
    private String agentInfoId;
    private String operation;
    private String fxTransactionId;
    private String updated_at;
    private String created_at;
    private Integer acquirerTransactionId;
    private String code;
    private String message;
    private String transactionId;
    @OneToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;
    @OneToOne(mappedBy = "merchantTransaction")
    private Transaction transaction;


}
