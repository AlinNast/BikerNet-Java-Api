package com.bikerNet.app.restApi.Repo;


import com.bikerNet.app.restApi.Models.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<PostModel, Long> {
}
