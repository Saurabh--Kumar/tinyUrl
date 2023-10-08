package com.saurabh.tinyUrl.controller;

import com.saurabh.tinyUrl.manager.UrlManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class TinyUrlController {


    @Autowired
    private UrlManager urlManager;

    @GetMapping(value = "{tinyUrl}")
    public ResponseEntity getId(@PathVariable String tinyUrl){
        return ResponseEntity.ok("");
    }
}
