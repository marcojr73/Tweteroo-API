package com.tweteroo.tweteroo.models;

import com.tweteroo.tweteroo.dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
public class UserModel {

    public UserModel(UserDto signUp){
        this.userName = signUp.userName();
        this.avatar = signUp.avatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String userName;
    
    @Column(length = 200, nullable = false)
    private String avatar;
}
