package com.tweteroo.tweteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweteroo.models.TweetsModel;

import java.util.List;

public interface TweetsRepository extends JpaRepository<TweetsModel, Long> {
    
    List<TweetsModel> findByUserName(String userName);

}
