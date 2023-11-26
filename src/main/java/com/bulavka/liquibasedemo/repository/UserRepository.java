package com.bulavka.liquibasedemo.repository;

import com.bulavka.liquibasedemo.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
