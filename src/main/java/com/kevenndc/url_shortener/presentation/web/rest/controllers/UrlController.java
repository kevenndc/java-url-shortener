package com.kevenndc.url_shortener.presentation.web.rest.controllers;

import com.kevenndc.url_shortener.application.usecases.CreateShortUrl.CreateShortUrl;
import com.kevenndc.url_shortener.application.usecases.CreateShortUrl.CreateShortUrlInput;
import com.kevenndc.url_shortener.application.usecases.CreateShortUrl.CreateShortUrlOutput;
import com.kevenndc.url_shortener.presentation.web.rest.api.UrlResource;
import com.kevenndc.url_shortener.presentation.web.rest.dto.CreateShortUrl.CreateShortUrlRequest;
import com.kevenndc.url_shortener.presentation.web.rest.dto.CreateShortUrl.CreateShortUrlResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController implements UrlResource {

    @Autowired
    private CreateShortUrl createShortUrl;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Override
    public CreateShortUrlResponse create(CreateShortUrlRequest createShortUrlDTO) {
        CreateShortUrlOutput output = this.createShortUrl.execute(new CreateShortUrlInput(createShortUrlDTO.getOriginalUrl(), this.httpServletRequest));
        CreateShortUrlResponse response = CreateShortUrlResponse.buildFromModel(output.getUrl());
        return new ResponseEntity<>(response, HttpStatus.CREATED).getBody();
    }

}
