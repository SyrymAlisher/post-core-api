package com.example.postcoreapi.controller.old;
import com.example.postcoreapi.service.serviceOld.PostServiceOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.postcoreapi.model.PostModel;

import javax.validation.Valid;
import java.util.List;


@RequestMapping("/post")
public class PostControllerOld {

    @Autowired
    Environment env;

    @GetMapping("/check")
    public String check()
    {
        return "post-core-api is working at " + env.getProperty("local.server.port");
    }



    @Autowired
    private PostServiceOld postService;

    @PostMapping
    public ResponseEntity<String> createPost(@Valid @RequestBody PostModel postModel) {
        postService.createPost(postModel);
        return new ResponseEntity<>("Successfully created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePostById(@PathVariable String postId,
                                                     @Valid @RequestBody PostModel postModel) {
        postService.updatePostById(postId, postModel);
        return new ResponseEntity<>("Successfully updated", HttpStatus.OK);
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deletePostById(@PathVariable String postId) {
        postService.deletePostById(postId);
        return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
    }
}

