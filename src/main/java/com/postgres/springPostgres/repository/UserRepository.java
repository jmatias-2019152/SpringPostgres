package com.postgres.springPostgres.repository;

import com.postgres.springPostgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}