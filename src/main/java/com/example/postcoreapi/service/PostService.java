package com.example.postcoreapi.service;

import com.example.postcoreapi.model.PostModel;
import com.example.postcoreapi.model.PostRequest;
import com.example.postcoreapi.model.PostResponse;

import java.util.List;

public interface PostService {
    PostResponse createPost(PostRequest postRequest);

    List<PostResponse> getAllPosts();

    PostResponse getPostById(String postId);

    PostResponse updatePostById(PostRequest postRequest);

    void deletePostById(String postId);
}
