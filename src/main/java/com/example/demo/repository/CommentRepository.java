package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository to store User data
@Repository
public interface CommentRepository extends JpaRepository<User,Long> {
}
