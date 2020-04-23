package com.example.demo.repository;

import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repository to store User data
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByUserId(Long user_id);
}
