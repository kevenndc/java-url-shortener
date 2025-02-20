package com.kevenndc.url_shortener.presentation.web.rest.api;

import com.kevenndc.url_shortener.presentation.web.rest.dto.CreateShortUrl.CreateShortUrlRequest;
import com.kevenndc.url_shortener.presentation.web.rest.dto.CreateShortUrl.CreateShortUrlResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/url")
public interface UrlResource {

    @PostMapping(produces = "application/json")
    @ResponseBody CreateShortUrlResponse create(@RequestBody CreateShortUrlRequest createShortUrlDTO);

}
