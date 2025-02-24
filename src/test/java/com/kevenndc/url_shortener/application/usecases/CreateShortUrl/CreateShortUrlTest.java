package com.kevenndc.url_shortener.application.usecases.CreateShortUrl;

import com.kevenndc.url_shortener.domain.models.Url;
import com.kevenndc.url_shortener.infrastructure.persistence.database.entities.UrlEntity;
import com.kevenndc.url_shortener.infrastructure.persistence.database.repositories.UrlRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CreateShortUrlTest {

    @Test
    void testOutputContainsInstanceOfURL() {
        UrlRepository urlRepositoryMock = mock(UrlRepository.class);
        UrlEntity urlEntity = new UrlEntity()
                .setOriginalUrl("http://test.com/test/1/get-test")
                .setCreatedAt(LocalDateTime.now());
        when(urlRepositoryMock.save(any(UrlEntity.class))).thenReturn(urlEntity.setId(2L));
        HttpServletRequest httpServletRequestMock = mock(HttpServletRequest.class);
        CreateShortUrlInput input = new CreateShortUrlInput("http://test.com/test/1/get-test", httpServletRequestMock);

        CreateShortUrl createShortUrl = new CreateShortUrl(urlRepositoryMock);

        CreateShortUrlOutput output = createShortUrl.execute(input);
        assertInstanceOf(Url.class, output.getUrl());
    }

}
