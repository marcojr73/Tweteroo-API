package com.tweteroo.tweteroo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.dto.UserDto;
import com.tweteroo.tweteroo.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class UserController {

    @Autowired
    private UserService signUpService;

    @PostMapping
    public ResponseEntity<String> newUser(@RequestBody @Valid UserDto req){
        signUpService.newUser(req);
        return ResponseEntity.ok().body("Ok");
    }


}
