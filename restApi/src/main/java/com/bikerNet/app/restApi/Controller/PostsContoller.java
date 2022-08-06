package com.bikerNet.app.restApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsContoller {

    @GetMapping(value = "/")
    public String getPage() {
        return "welcome";
    }
}
