package com.kevenndc.url_shortener.application.url.usecases.CreateShortUrl;

import jakarta.servlet.http.HttpServletRequest;

public class CreateShortUrlInput {

    private final String originalUrl;
    private final HttpServletRequest request;

    public CreateShortUrlInput(String originalUrl, HttpServletRequest request) {
        this.originalUrl = originalUrl;
        this.request = request;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public HttpServletRequest getRequest() {
        return request;
    }
}
