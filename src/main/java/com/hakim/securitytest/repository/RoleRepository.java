package com.hakim.securitytest.repository;

import com.hakim.securitytest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByAuthority(String authority);
}
