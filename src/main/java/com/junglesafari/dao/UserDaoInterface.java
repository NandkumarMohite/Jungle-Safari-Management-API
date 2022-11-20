package com.junglesafari.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junglesafari.model.User;

@Repository
public interface UserDaoInterface  extends JpaRepository<User, Integer>{
	public User findByEmailIdAndPassword(String emailId , String password);
}