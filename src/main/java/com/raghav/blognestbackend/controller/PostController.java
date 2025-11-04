package com.raghav.blognestbackend.controller;

import com.raghav.blognestbackend.Entities.Post;
import com.raghav.blognestbackend.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;

@RestController
@CrossOrigin
public class PostController {

    @Autowired
    private PostServices postServices;

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return postServices.createPost(post);
    }

    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postServices.getPostById(id);
    }

    @GetMapping("/posts/paginated")
    public Page<Post> getAllPosts(@RequestParam int page, @RequestParam int size) {
        return postServices.getAllPosts(page, size);
    }

    @GetMapping("/categories/{categoryId}/posts")
    public Page<Post> getPostsByCategory(@PathVariable Long categoryId, @RequestParam int page, @RequestParam int size) {
        return postServices.getPostsByCategory(categoryId, page, size);
    }

    @GetMapping("/users/{userId}/posts")
    public Page<Post> getPostsByUser(@PathVariable Long userId, @RequestParam int page, @RequestParam int size) {
        return postServices.getPostsByUser(userId, page, size);
    }

    @PutMapping("/posts/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post post) {
        return postServices.updatePost(id, post);
    }

    @DeleteMapping("/posts/{id}")
    public boolean deletePost(@PathVariable Long id) {
        return postServices.deletePost(id);
    }
}
