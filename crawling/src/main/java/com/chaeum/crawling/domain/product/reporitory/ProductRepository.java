package com.chaeum.crawling.domain.product.reporitory;

import com.chaeum.crawling.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
