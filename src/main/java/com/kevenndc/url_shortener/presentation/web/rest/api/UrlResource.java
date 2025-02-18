package com.kevenndc.url_shortener.presentation.web.rest.api;

import com.kevenndc.url_shortener.domain.models.Url;
import com.kevenndc.url_shortener.presentation.web.rest.dto.url.CreateUrlDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/url")
public interface UrlResource {

    @PostMapping()
    public Url create(@RequestBody CreateUrlDTO createUrlDTO);

}
