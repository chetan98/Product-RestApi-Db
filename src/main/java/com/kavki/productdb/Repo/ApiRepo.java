package com.kavki.productdb.Repo;

import com.kavki.productdb.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiRepo extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
