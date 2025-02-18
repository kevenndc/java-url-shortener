package com.kevenndc.url_shortener.presentation.web.rest.dto.url;

public class CreateUrlDTO {

    private String originalUrl;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }
}
