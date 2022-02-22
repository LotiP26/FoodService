package com.cogent.fooddeliveryapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.fooddeliveryapp.dto.Role;
import com.cogent.fooddeliveryapp.enums.ERole;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByRoleName(ERole roleName);

}
