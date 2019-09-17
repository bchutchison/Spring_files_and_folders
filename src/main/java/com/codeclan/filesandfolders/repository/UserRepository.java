package com.codeclan.filesandfolders.repository;

import com.codeclan.filesandfolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
