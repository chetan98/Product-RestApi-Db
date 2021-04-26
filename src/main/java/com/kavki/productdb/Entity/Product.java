package com.kavki.productdb.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Product_TBL")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qty;
    private double price;
}
