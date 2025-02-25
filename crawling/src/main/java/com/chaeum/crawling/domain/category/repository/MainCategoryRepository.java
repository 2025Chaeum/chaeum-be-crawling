package com.chaeum.crawling.domain.category.repository;

import com.chaeum.crawling.domain.category.entity.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainCategoryRepository extends JpaRepository<MainCategory, Integer> {
}
