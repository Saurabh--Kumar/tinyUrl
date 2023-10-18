package com.saurabh.tinyUrl.manager;

import com.saurabh.tinyUrl.dao.UrlDao;
import com.saurabh.tinyUrl.domain.entry.TinyUrlEntry;
import com.saurabh.tinyUrl.domain.exception.TinyUrlException;
import com.saurabh.tinyUrl.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UrlManager {

    @Autowired
    UrlDao urlDao;


    public String getFullUrl(String tinyUrl) throws TinyUrlException {

        TinyUrlEntry tinyUrlEntry = urlDao.getFullUrl(tinyUrl);

        if(tinyUrlEntry !=null && tinyUrlEntry.getExpiryDate().after(new Date())){
            return tinyUrlEntry.getFullUrl();
        }

        throw new TinyUrlException();
    }
}
