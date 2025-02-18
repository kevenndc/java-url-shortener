package com.kevenndc.url_shortener.presentation.web.rest.controllers;

import com.kevenndc.url_shortener.domain.models.Url;
import com.kevenndc.url_shortener.presentation.web.rest.api.UrlResource;
import com.kevenndc.url_shortener.presentation.web.rest.dto.url.CreateUrlDTO;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class UrlController implements UrlResource {

    @Override
    public Url create(CreateUrlDTO createUrlDTO) {
        return new Url("test", createUrlDTO.getOriginalUrl(), "https://short.url/aWsP", LocalDateTime.now());
    }

}
