package com.example.learning.JPA.learnjpa.service;

import com.example.learning.JPA.learnjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
