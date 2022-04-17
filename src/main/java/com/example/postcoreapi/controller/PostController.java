package com.example.postcoreapi.controller;


import com.example.postcoreapi.model.PostModel;
import com.example.postcoreapi.model.PostRequest;
import com.example.postcoreapi.model.PostResponse;
import com.example.postcoreapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public PostResponse createPost(@RequestBody PostRequest postRequest) {
        return postService.createPost(postRequest);
    }

    @PutMapping
    public PostResponse updatePost(@RequestParam  String postId, @RequestBody PostRequest postRequest) {
        postRequest.setPostId(postId);
        return postService.updatePostById(postRequest);
    }

    @GetMapping
    public PostResponse getPostById(@RequestParam String postId) {
        return postService.getPostById(postId);
    }

    @GetMapping("/all")
    public List<PostResponse> getAllPosts() {
        return postService.getAllPosts();
    }

    @DeleteMapping
    public void deletePost(@RequestParam String postId) {
        postService.deletePostById(postId);
    }
}
