package com.twistlet.hemlock.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twistlet.hemlock.model.entity.HemlockUser;

public interface HemlockUserRepository extends JpaRepository<HemlockUser, String> {

}
