package com.example.guardian.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fx_merchant")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FxMerchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private Integer originalAmount;
    private String originalCurrency;
    private Integer convertedAmount;
    private String convertedCurrency;
}
