package com.WCS.CheckPoint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/users/{id}")
	public ResponseEntity<Users> showUserDetails(@PathVariable Long id){
		Users user = usersService.getUserById(id);
		return ResponseEntity.ok().body(user);
	}
	
	@PutMapping("/users/{id}")
	public Users updateUser(@PathVariable Long id, @RequestBody Users user) {
		Users userToUpdate = usersService.editUser(id,user);
		return userToUpdate;
	}
}
