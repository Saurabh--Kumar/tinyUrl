package com.saurabh.tinyUrl.dao;

import com.saurabh.tinyUrl.domain.exception.TinyUrlException;
import com.saurabh.tinyUrl.entity.TinyUrlEntity;
import com.saurabh.tinyUrl.repository.UrlRepository;
import com.saurabh.tinyUrl.domain.entry.TinyUrlEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UrlDao {

    @Autowired
    UrlRepository urlRepository;

    public TinyUrlEntry getFullUrl(String tinyUrl) throws TinyUrlException {
        Optional<TinyUrlEntity> tinyUrlEntityOptional = urlRepository.findById(tinyUrl);

        if( tinyUrlEntityOptional.isPresent()) {
            return tinyUrlEntityOptional.get().transformToTinyUrlEntry();
        }

        throw new TinyUrlException();
    }

}
