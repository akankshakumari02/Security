package com.springsecurity.demo.springsecurityoath2bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public User viewProfile(String username)
    {
        return userRepository.findByUsername(username);
    }
}
