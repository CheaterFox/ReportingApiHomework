package com.example.guardian.entity;

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

    @OneToMany(mappedBy = "merchant")
    private List<MerchantTransaction> merchantTransactionList;

    @OneToMany(mappedBy = "merchant")
    private List<Transaction> transactionList;

}
