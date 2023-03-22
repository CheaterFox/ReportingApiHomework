package com.example.guardian.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "merchant")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

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
    private String iPNUrl;
    private String ipnType;

    @OneToMany(mappedBy = "merchant")
    private List<Transaction> transactionList;

}
