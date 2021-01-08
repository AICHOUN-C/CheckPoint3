package com.WCS.CheckPoint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WCS.CheckPoint3.entities.Post;
import com.WCS.CheckPoint3.services.UserPostsService;

@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev", maxAge = 3600)
@RestController
public class PostController {

	@Autowired
	UserPostsService postService;
	
	@GetMapping("/posts")
	public List<Post> index() {
		return postService.getAllPosts();
	}
}
