package com.gustavo.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

