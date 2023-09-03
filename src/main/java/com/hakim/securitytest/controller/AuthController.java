package com.hakim.securitytest.controller;

import com.hakim.securitytest.model.User;
import com.hakim.securitytest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<?> register(User user){
        return ResponseEntity.ok(userService.saveUser(user));
    }
}
