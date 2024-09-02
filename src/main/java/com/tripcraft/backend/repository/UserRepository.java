// UserRepository.java
package com.tripcraft.backend.repository;

import com.tripcraft.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}