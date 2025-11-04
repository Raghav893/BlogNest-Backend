package com.raghav.blognestbackend.services;

import com.raghav.blognestbackend.Entities.Post;
import com.raghav.blognestbackend.repositories.PostRepo;
import com.raghav.blognestbackend.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServices {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private UserRepo userRepo;

    public Post createPost(Post post) {
        post.setUser(userRepo.findById(1L).orElse(null));
        return postRepo.save(post);
    }


    public Post getPostById(Long id) {
        return postRepo.findById(id).orElse(null);
    }

    public Page<Post> getAllPosts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return postRepo.findAll(pageable);
    }

    public Page<Post> getPostsByCategory(Long categoryId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return postRepo.findByCategoryId(categoryId, pageable);
    }

    public Page<Post> getPostsByUser(Long userId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return postRepo.findByUserId(userId, pageable);
    }

    public Post updatePost(Long postId, Post updatedPost) {
        return postRepo.findById(postId).map(post -> {
            post.setTitle(updatedPost.getTitle());
            post.setContent(updatedPost.getContent());
            post.setCategory(updatedPost.getCategory());
            post.setUser(updatedPost.getUser());
            return postRepo.save(post);
        }).orElse(null);
    }

    public boolean deletePost(Long postId) {
        if (postRepo.existsById(postId)) {
            postRepo.deleteById(postId);
            return true;
        }
        return false;
    }
}
