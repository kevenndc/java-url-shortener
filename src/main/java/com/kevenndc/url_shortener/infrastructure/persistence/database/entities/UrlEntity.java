package com.kevenndc.url_shortener.infrastructure.persistence.database.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "url")
public class UrlEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "alias", unique = true, nullable = false)
    private String alias;

    @Column(name = "original_url", nullable = false)
    private String originalUrl;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public UrlEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAlias() {
        return this.alias;
    }

    public UrlEntity setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public UrlEntity setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public UrlEntity setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public UrlEntity setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
