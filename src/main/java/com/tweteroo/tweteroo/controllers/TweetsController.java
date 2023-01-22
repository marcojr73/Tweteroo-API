package com.tweteroo.tweteroo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.dto.TweetsDto;
import com.tweteroo.tweteroo.models.TweetsModel;
import com.tweteroo.tweteroo.services.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
@CrossOrigin    (origins = "*")
public class TweetsController {
    
    @Autowired 
    TweetService tweetsService;

    @PostMapping
    public ResponseEntity<String> postTweet(@RequestBody @Valid TweetsDto tweet){
        String ans = tweetsService.saveTweet(tweet);
        if(ans.equals("error")){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body("Ok");
        }
    }

    @GetMapping
    public ResponseEntity<Page<TweetsModel>> getLastTweets(@RequestParam(value = "page") int page){
        return ResponseEntity.ok().body(tweetsService.getLastTweets(page));
    }

    @GetMapping("/{userName}")
    public ResponseEntity<List<TweetsModel>> getAllTweets(@PathVariable String userName){
        final List<TweetsModel> tweets = tweetsService.getAllTweetsByUser(userName);
        return ResponseEntity.ok().body(tweets);

    }
}
