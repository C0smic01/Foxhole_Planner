package com.example.foxholeplanner.AuthService.repository;

import com.example.foxholeplanner.AuthService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
