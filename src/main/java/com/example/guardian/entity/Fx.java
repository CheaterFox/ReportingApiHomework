package com.example.guardian.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fx")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Fx {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "merchant_id")
    private FxMerchant merchant;

    @OneToOne(mappedBy = "fx")
    private Transaction transaction;
}
