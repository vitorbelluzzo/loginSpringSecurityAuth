package com.ventidue.SpringSecurityLogin.repository;

import com.ventidue.SpringSecurityLogin.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}