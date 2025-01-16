package com.javaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
