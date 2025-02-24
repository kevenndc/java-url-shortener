package com.kevenndc.url_shortener.application.usecases.CreateShortUrl;

import com.kevenndc.url_shortener.domain.models.Url;

public class CreateShortUrlOutput {

    private final Url url;

    public CreateShortUrlOutput(Url url) {
        this.url = url;
    }

    public Url getUrl() {
        return url;
    }
}
