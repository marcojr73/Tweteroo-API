package com.tweteroo.tweteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.tweteroo.tweteroo.dto.TweetsDto;
import com.tweteroo.tweteroo.models.UserModel;
import com.tweteroo.tweteroo.models.TweetsModel;
import com.tweteroo.tweteroo.repositories.UserRepository;

import java.util.List;

import com.tweteroo.tweteroo.repositories.TweetsRepository;

@Service
public class TweetService {

    @Autowired
    TweetsRepository tweetsRepository;
    @Autowired
    UserRepository userRepository;

    public String saveTweet(TweetsDto tweet) {
        UserModel user = userRepository.findByUserName(tweet.userName());
        if(user == null) {
            return "error";
        } else {
            String userName = user.getUserName();
            tweetsRepository.save(new TweetsModel(tweet, userName));
            return "Ok";
        }
    }

    public Page<TweetsModel> getLastTweets(int page){
        Pageable pageable = PageRequest.of(page, 5);
        return tweetsRepository.findAll(pageable);
    }

    public List<TweetsModel> getAllTweetsByUser(String userName){
        return tweetsRepository.findByUserName(userName);
    }
}
