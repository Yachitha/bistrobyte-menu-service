package com.bistrobyte.bistrobytemenuservice.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "menu_item")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "restaurant_id", nullable = false)
    private String restaurantId;

    @Column(nullable = false)
    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private MenuCategory menuCategory;

    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;

    @Column(name="is_vegetarian", nullable = false)
    private boolean isVegetarian;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "is_customizable", nullable = false)
    private boolean isCustomizable;

    private BigDecimal price;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
