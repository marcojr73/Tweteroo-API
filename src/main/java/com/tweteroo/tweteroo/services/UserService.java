package com.tweteroo.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.tweteroo.dto.UserDto;
import com.tweteroo.tweteroo.models.UserModel;
import com.tweteroo.tweteroo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository signUpRepository;

    public void newUser(UserDto signUp){
        signUpRepository.save(new UserModel(signUp));
    }
    
}
