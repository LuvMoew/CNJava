package com.example.bkt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bkt.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
} 