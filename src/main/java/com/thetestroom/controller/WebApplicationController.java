package com.thetestroom.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplicationController {

    @RequestMapping("hi/{name}")
    public String helloEndPoint(@PathVariable() String name) {
        return "hi " + name;
    }
}
