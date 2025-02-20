package com.kevenndc.url_shortener.infrastructure.persistence.database.repositories;


import com.kevenndc.url_shortener.infrastructure.persistence.database.entities.UrlEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<UrlEntity, Long> {

}
