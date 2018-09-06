package com.oauth.google.googleoauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("user")
    public Principal user(Principal principal){
        return principal;
    }

}
