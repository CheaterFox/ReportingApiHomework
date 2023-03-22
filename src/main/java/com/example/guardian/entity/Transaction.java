package com.example.guardian.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transaction")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private String id;
    private String updated_at;
    private String created_at;
    private Boolean refundable;

    @ManyToOne
    @JoinColumn(name = "customer_ınfo_id")
    private CustomerInfo customerInfo;

    @ManyToOne
    @JoinColumn(name = "acquirer_id")
    private Acquirer acquirer ;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;
}
