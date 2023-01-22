package com.tweteroo.tweteroo.models;

import com.tweteroo.tweteroo.dto.TweetsDto;

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
public class TweetsModel {
    public TweetsModel(TweetsDto tweet, String avatar){
        this.userName = tweet.userName();
        this.avatar = avatar;
        this.tweet = tweet.tweet();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(length = 200, nullable = false)
    private String avatar;

    @Column(length = 200, nullable = false)
    private String userName;
    
    @Column(length = 200, nullable = false)
    private String tweet;
}
