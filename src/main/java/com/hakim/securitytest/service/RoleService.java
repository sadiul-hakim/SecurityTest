package com.hakim.securitytest.service;

import com.hakim.securitytest.model.Role;
import com.hakim.securitytest.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public Role findById(int roleId) {
        return roleRepository.findById(roleId)
                .orElseThrow(() -> new ResourceAccessException("Role is not found by id : " + roleId));
    }

    public Role findByAuthority(String authority) {
        return roleRepository.findByAuthority(authority)
                .orElseThrow(() -> new ResourceAccessException("Role is not found by authority : " + authority));
    }
}
