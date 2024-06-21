package com.tush.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tush.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
