package com.WCS.CheckPoint3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WCS.CheckPoint3.entities.Post;
import com.WCS.CheckPoint3.entities.Users;
import com.WCS.CheckPoint3.repository.PostRepository;
import com.WCS.CheckPoint3.repository.UsersRepository;

@Service
public class UserPostsService {
	
	@Autowired UsersRepository userRepository;
	
	@Autowired PostRepository postRepository;
	
	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}
	
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}
	public Users getUserById(Long id) {
		return userRepository.findById(id).get();
	}
	
}
