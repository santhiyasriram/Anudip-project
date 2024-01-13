package com.example.dream.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.dream.Entity.User;


@Repository

@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User,Integer> {

	@Query(value =  "select * from User where emailAddress =?" , nativeQuery = true)
	User findByEmailAddress(String emailAddress);

	
}