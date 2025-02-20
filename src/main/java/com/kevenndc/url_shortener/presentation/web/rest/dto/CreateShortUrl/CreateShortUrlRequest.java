package com.kevenndc.url_shortener.presentation.web.rest.dto.CreateShortUrl;

public class CreateShortUrlRequest {
    private final String originalUrl;

    public CreateShortUrlRequest(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }
}
