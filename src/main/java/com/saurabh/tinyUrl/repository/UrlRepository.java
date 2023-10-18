package com.saurabh.tinyUrl.repository;

import com.saurabh.tinyUrl.entity.TinyUrlEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UrlRepository extends CrudRepository<TinyUrlEntity, String> {
    Optional<TinyUrlEntity> findById(Integer id);

    TinyUrlEntity save(TinyUrlEntity entity);
}
