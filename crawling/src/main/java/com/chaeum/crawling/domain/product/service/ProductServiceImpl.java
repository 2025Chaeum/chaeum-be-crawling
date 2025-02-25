package com.chaeum.crawling.domain.product.service;

import com.chaeum.crawling.domain.category.repository.MainCategoryRepository;
import com.chaeum.crawling.domain.category.repository.SubCategoryRepository;
import com.chaeum.crawling.domain.product.reporitory.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final MainCategoryRepository mainCategoryRepository;
    private final SubCategoryRepository subCategoryRepository;

}
