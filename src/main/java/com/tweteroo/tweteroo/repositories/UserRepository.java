package com.tweteroo.tweteroo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweteroo.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserModel findByUserName(String userName);

}
