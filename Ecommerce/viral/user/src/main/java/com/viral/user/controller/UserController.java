package com.viral.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viral.user.model.User;
import com.viral.user.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/search/city/{city}")
	public List<User> searchAllUserByCity(@PathVariable String city) {
		return userService.searchAllUserByCity(city);
	}

	//type :- endUser, Marchant, Admin
	@GetMapping("/search/type/{type}")
	public List<User> searchAllUserByType(@PathVariable String type) {
		return userService.searchAllUserByType(type);
	}
	
	//this will use to response all information of user such as how much sell or purchase here will get all this information from order service
	//this wiil show to only marchant
	public List<Object> getUserDashboard(){
		return null;
	}
	
}
