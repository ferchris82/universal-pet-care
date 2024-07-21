package com.chrisferdev.universalpetcare.repository;

import com.chrisferdev.universalpetcare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
