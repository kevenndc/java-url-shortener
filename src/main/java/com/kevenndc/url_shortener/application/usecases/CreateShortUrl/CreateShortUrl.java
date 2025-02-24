package com.kevenndc.url_shortener.application.url.usecases.CreateShortUrl;

import com.kevenndc.url_shortener.common.utils.RandomUrlAliasGenerator;
import com.kevenndc.url_shortener.domain.models.Url;
import com.kevenndc.url_shortener.infrastructure.persistence.database.entities.UrlEntity;
import com.kevenndc.url_shortener.infrastructure.persistence.database.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CreateShortUrl {

    @Autowired
    private final UrlRepository urlRepository;

    public CreateShortUrl(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public CreateShortUrlOutput execute(CreateShortUrlInput input) {
        UrlEntity urlEntity = new UrlEntity()
                .setOriginalUrl(input.getOriginalUrl())
                .setAlias(RandomUrlAliasGenerator.generate())
                .setCreatedAt(LocalDateTime.now());

        urlEntity = this.urlRepository.save(urlEntity);

        Url url = new Url(urlEntity.getId(), input.getRequest().getScheme(), input.getRequest().getServerName(),
                input.getRequest().getServerPort(), urlEntity.getAlias(), urlEntity.getOriginalUrl(),
                urlEntity.getCreatedAt(), urlEntity.getUpdatedAt());

        return new CreateShortUrlOutput(url);
    }

}
