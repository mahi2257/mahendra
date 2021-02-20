package com.viral.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.viral.user.dao.IUserDao;
import com.viral.user.model.User;

@Service
public class UserService implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User createUser(User user) {
		User userDtls = null;
		if(!ObjectUtils.isEmpty(user)) {
			userDtls = userDao.save(user);
			return userDtls;
		}
		return userDtls;
	}
	
	@Override
	public List<User> searchAllUserByCity(String city) {
		return null;
	}
	
	@Override
	public List<User> searchAllUserByType(String type) {
		return null;
	}


	@Override
	public User updateUser(User user) {
		return null;
	}

	@Override
	public String resetPassword(String userId) {
		return null;
	}

	@Override
	public String passwordChange(String userId) {
		return null;
	}

}
