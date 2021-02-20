package com.viral.user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.viral.user.model.User;

@Repository
public interface IUserDao extends JpaRepository<User, Long>{
	
	public List<User> searchAllUserByType(String type);

}
