package com.security.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.Pojo.User;
import com.security.Service.UserService;

@RestController
@RequestMapping("/home")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		List<User> allUser = service.getAllUser();
		return allUser;
		
	}

	@GetMapping("user/{id}")
	public User getById(@PathVariable("id") int id) {
		User byId = service.getById(id);
		return byId;
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
}
