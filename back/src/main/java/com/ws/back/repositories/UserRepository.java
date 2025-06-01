package com.ws.back.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ws.back.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    List<UserEntity> findAll();
}
