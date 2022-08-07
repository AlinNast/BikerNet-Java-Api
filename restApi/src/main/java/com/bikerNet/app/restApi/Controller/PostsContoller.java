package com.bikerNet.app.restApi.Controller;

import com.bikerNet.app.restApi.Models.PostModel;
import com.bikerNet.app.restApi.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsContoller {

    @Autowired
    private PostRepo postRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "welcome";
    }

    @GetMapping(value = "/api/posts")
    public List<PostModel> getPosts() {
        return postRepo.findAll();
    }

    @PostMapping(value = "/api/newpost")
    public PostModel newPost(@RequestBody PostModel post) {
        postRepo.save(post);
        return post;
    }

    @PutMapping(value = "/api/editpost/{id}")
    public PostModel editPost(@PathVariable Long id, @RequestBody PostModel post) {
        PostModel updatedPost = postRepo.findById(id).get();

        updatedPost.setTitle(post.getTitle());
        updatedPost.setDescription(post.getDescription());
        updatedPost.setLocation(post.getLocation());

        postRepo.save(updatedPost);
        return updatedPost;
    }

    @DeleteMapping(value = "/api/deletepost/{id}")
    public String deletePost(@PathVariable Long id) {
        PostModel deletePost = postRepo.findById(id).get();
        postRepo.delete(deletePost);
        return "Deleted user with id"+id;
    }
}
