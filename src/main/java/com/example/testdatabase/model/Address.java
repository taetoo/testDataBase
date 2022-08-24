package com.example.testdatabase.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long num;

    @Column(nullable = false)
    private String numAddress;

    //법정코드
    @Column(nullable = false)
    private Long bCode;

}
