package com.cogent.fooddeliveryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.fooddeliveryapp.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
