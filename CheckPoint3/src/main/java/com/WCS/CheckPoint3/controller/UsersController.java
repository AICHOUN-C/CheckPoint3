package com.WCS.CheckPoint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WCS.CheckPoint3.entities.Users;
import com.WCS.CheckPoint3.services.UserPostsService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UsersController {

	@Autowired
	UserPostsService usersService;
	
	@GetMapping("/users")
	public List<Users> index() {
		return usersService.getAllUsers();
	}
}
