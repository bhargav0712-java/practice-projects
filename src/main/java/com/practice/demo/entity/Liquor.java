package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb020_liquor_stores")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Liquor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "store_name")
    private String storeName;

    @Column(name = "address")
    private String address;

    @Column(name = "license_no")
    private String licenseNo;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "profit_per_day")
    private Double profitPerDay;
    
}
