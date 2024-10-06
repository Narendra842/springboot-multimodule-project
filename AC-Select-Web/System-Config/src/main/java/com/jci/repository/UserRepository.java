package com.jci.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jci.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
