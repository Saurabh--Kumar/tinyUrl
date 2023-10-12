package com.saurabh.tinyUrl.controller;

import com.saurabh.tinyUrl.manager.UrlManager;
import com.saurabh.tinyUrl.request.FullUrlRequest;
import com.saurabh.tinyUrl.response.ShrinkUrlResponse;
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
        String fullUrl = urlManager.getFullUrl(tinyUrl);

        response.sendRedirect(fullUrl);
        response.setStatus(303);
    }

    @PostMapping(value = "shrinkUrl")
    public ShrinkUrlResponse shrinkUrl(@RequestBody FullUrlRequest fullUrlRequest) {
        return null;
    }
}
