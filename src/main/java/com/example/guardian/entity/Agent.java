package com.example.guardian.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "acquirer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String customerIp;
    private String customerUserAgent;
    private String merchantIp;

    @OneToOne(mappedBy = "agent")
    private MerchantTransaction merchantTransaction;
}
