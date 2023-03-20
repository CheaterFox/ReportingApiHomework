package com.example.guardian.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "acquirer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Acquirer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String name;

    private String code;

    private String type;

    @OneToMany(mappedBy = "acquirer")
    private List<Transaction> transactionList;

}
