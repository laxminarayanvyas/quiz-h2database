package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.bean.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
