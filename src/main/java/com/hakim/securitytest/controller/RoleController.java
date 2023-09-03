package com.hakim.securitytest.controller;

import com.hakim.securitytest.model.Role;
import com.hakim.securitytest.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService;
    @PostMapping("/save")
    public ResponseEntity<?> save(Role role){
        return ResponseEntity.ok(roleService.saveRole(role));
    }
}
