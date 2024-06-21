package com.tush.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tush.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
