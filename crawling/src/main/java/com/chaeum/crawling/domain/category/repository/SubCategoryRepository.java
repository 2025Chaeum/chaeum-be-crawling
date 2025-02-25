package com.chaeum.crawling.domain.category.repository;

import com.chaeum.crawling.domain.category.entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {
}
