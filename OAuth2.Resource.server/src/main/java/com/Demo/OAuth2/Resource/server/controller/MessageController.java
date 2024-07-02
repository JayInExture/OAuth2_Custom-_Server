package com.Demo.OAuth2.Resource.server.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/Hello")
    public String Hello(){
        return "Hello from resource Server";
    }
}
