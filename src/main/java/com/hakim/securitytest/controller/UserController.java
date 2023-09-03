package com.hakim.securitytest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @GetMapping("/")
    public ResponseEntity<?> helloUserController(){
        return ResponseEntity.ok(Collections.singletonMap("message","User Access Level."));
    }
}
