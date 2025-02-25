package com.chaeum.crawling.domain.product.entity;

import com.chaeum.crawling.domain.category.entity.MainCategory;
import com.chaeum.crawling.domain.category.entity.SubCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id", nullable = false)
    private Long productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "main_category_id", nullable = false)
    private MainCategory mainCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_category_id", nullable = false)
    private SubCategory subCategory;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int code;

    @Column(nullable = false)
    private int price;

    @Column(name="main_photo", nullable = false)
    private String mainPhoto;

    @Column(name="detail_photo", nullable = false)
    private String detailPhoto;

    @Builder.Default
    @Column(nullable = false)
    private int discount = 0;

    @Column(name = "created_at", updatable = false, nullable = false, columnDefinition = "DATETIME")
    @CreatedDate
    private LocalDateTime createdAt;

}
