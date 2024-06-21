package com.tush.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tush.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
