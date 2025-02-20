package com.kevenndc.url_shortener.presentation.web.rest.dto.CreateShortUrl;

import com.kevenndc.url_shortener.domain.models.Url;

import java.time.format.DateTimeFormatter;

public class CreateShortUrlResponse {

    private Long id;
    private String domain;
    private String alias;
    private String shortUrl;
    private String originalUrl;
    private String createdAt;
    private String updatedAt;

    public CreateShortUrlResponse(Long id, String domain, String alias, String shortUrl, String originalUrl, String createdAt, String updatedAt) {
        this.id = id;
        this.domain = domain;
        this.alias = alias;
        this.shortUrl = shortUrl;
        this.originalUrl = originalUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public CreateShortUrlResponse() {}

    public static CreateShortUrlResponse buildFromModel(Url url) {
        String updatedAt = null;
        if (url.getUpdatedAt().isPresent()) {
            updatedAt = url.getUpdatedAt().get().format(DateTimeFormatter.ISO_DATE_TIME);
        }
        return new CreateShortUrlResponse(url.getId(), url.getDomain(), url.getAlias(), url.getShortUrl(), url.getOriginalUrl(),
                url.getCreatedAt().toString(), updatedAt);
    }

    public Long getId() {
        return id;
    }

    public String getDomain() {
        return domain;
    }

    public String getAlias() {
        return alias;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
