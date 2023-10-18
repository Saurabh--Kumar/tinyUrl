package com.saurabh.tinyUrl.controller;

import com.saurabh.tinyUrl.domain.exception.TinyUrlException;
import com.saurabh.tinyUrl.domain.response.ShrinkUrlResponse;
import com.saurabh.tinyUrl.manager.UrlManager;
import com.saurabh.tinyUrl.domain.response.ShrinkUrlResponse;
import com.saurabh.tinyUrl.domain.request.FullUrlRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping(path = "/")
public class TinyUrlController {


    @Autowired
    private UrlManager urlManager;

    @GetMapping(value = "{tinyUrl}")
    public void getFullUrl(@PathVariable String tinyUrl, HttpServletResponse response) throws IOException {
        String fullUrl = null;
        try {
            fullUrl = urlManager.getFullUrl(tinyUrl);
        } catch (TinyUrlException e) {
            e.printStackTrace();
        }

        response.sendRedirect(fullUrl);
        response.setStatus(303);
    }

    @PostMapping(value = "shrinkUrl")
    public ShrinkUrlResponse shrinkUrl(@RequestBody FullUrlRequest fullUrlRequest) {
        return null;
    }
}
