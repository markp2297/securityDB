package com.example.secuirtyDB.demosecuirtyDB;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUserName(String name);
}