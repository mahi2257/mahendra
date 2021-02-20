package com.viral.user.service;

import java.util.List;
import com.viral.user.model.User;

public interface IUserService {

	public User createUser(User user);
	
	public List<User> searchAllUserByCity(String city);
	
	public List<User> searchAllUserByType(String type);
	
	public User updateUser(User user);
		
	//get userId as emailId or mobileNumber
	public String resetPassword(String userId);
	
	//get userId as emailId or mobileNumber
	public String passwordChange(String userId);
	
	
}
