package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.User;
import com.example.demo.repository.FollowerRepository;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    FollowerRepository followerRepository;


    public List<User> findUsers() {
        List<User> users = userRepository.findAll();
        users.forEach(u ->  {
            u.setPosts(postRepository.findByUserId(u.getId()));
            u.setFollowers(followerRepository.findByUserId(u.getId()));
        });
        return users;
    }

    public User findUser(Long id) {
        User user = userRepository.findById(id).get();
        user.setPosts(postRepository.findByUserId(id));
        user.setFollowers(followerRepository.findByUserId(id));

        return user;
    }



}


