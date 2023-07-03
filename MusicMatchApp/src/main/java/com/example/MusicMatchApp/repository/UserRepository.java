package com.example.MusicMatchApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MusicMatchApp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
