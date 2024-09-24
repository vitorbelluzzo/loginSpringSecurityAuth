package com.ventidue.SpringSecurityLogin.repository;

import com.ventidue.SpringSecurityLogin.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}