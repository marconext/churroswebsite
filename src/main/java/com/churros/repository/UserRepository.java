package com.churros.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.churros.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}