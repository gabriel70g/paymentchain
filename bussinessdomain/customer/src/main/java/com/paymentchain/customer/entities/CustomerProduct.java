/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paymentchain.customer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 *
 * @author sotobotero
 */
@Data
@Entity
public class CustomerProduct {
    
       @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private long productId;
    @Transient
    private String productName;
    
    @JsonIgnore//it is necesary for avoid infinite recursion
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Customer.class)
    @JoinColumn(name = "customerId", nullable = true)   
    private Customer customer;      
    
}
