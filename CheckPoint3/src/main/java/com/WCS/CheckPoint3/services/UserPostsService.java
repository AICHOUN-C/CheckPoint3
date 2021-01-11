package com.WCS.CheckPoint3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.WCS.CheckPoint3.entities.Comments;
import com.WCS.CheckPoint3.entities.Post;
import com.WCS.CheckPoint3.entities.Users;
import com.WCS.CheckPoint3.repository.CommentsRepository;
import com.WCS.CheckPoint3.repository.PostRepository;
import com.WCS.CheckPoint3.repository.UsersRepository;

@Service
public class UserPostsService {
	
	@Autowired UsersRepository userRepository;
	
	@Autowired PostRepository postRepository;
	
	@Autowired CommentsRepository commentsRepository;
	
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}
	
	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}
	
	public Users getUserById(Long id) {
		return userRepository.findById(id).get();
	}
	
	public Users editUser( Long id, Users user) {
		Users userToUpdate = userRepository.findById(id).get();
		userToUpdate.setFirstname(user.getFirstname());
		userToUpdate.setLastname(user.getLastname());
		userToUpdate.setImageUrl(user.getImageUrl());
		return userRepository.save(userToUpdate);
	}
	
	public List<Comments> getAllComments() {
		return commentsRepository.findAll();
	}
	
}
