package com.twistlet.hemlock.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twistlet.hemlock.model.entity.HemlockUserRole;

public interface HemlockUserRoleRepository extends JpaRepository<HemlockUserRole, Long> {

	List<HemlockUserRole> findByHemlockUserUsername(String username);

}
