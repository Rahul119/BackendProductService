package com.scaler.backendproductservice.repositories;

import com.scaler.backendproductservice.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save();
}
