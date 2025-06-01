package com.ws.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.back.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
}
