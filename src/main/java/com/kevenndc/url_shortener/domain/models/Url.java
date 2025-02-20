package com.kevenndc.url_shortener.domain.models;

import java.time.LocalDateTime;
import java.util.Optional;

public class Url {

    private Long id;
    private String scheme;
    private String domain;
    private Integer port;
    private String alias;
    private String originalUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Url(Long id, String scheme, String domain, Integer port, String alias, String originalUrl, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.scheme = scheme;
        this.domain = domain;
        this.port = port;
        this.alias = alias;
        this.originalUrl = originalUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Url() {
    }

    public String getShortUrl() {
        String shortUrl = this.scheme + "://" + this.domain;
        if (this.port != null) {
            shortUrl += ":" + this.port;
        }
        return shortUrl + "/" + this.alias;
    }

    public Long getId() {
        return id;
    }

    public Url setId(Long id) {
        this.id = id;
        return this;
    }

    public String getScheme() {
        return scheme;
    }

    public Url setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public Url setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public Url setPort(Integer port) {
        this.port = port;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public Url setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public Url setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Url setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Optional<LocalDateTime> getUpdatedAt() {
        return Optional.ofNullable(updatedAt);
    }

    public Url setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

}
