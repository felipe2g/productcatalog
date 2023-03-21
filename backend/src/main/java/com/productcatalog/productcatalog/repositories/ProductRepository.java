package com.productcatalog.productcatalog.repositories;

import com.productcatalog.productcatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}