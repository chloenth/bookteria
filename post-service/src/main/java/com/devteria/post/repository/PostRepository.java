package com.devteria.post.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devteria.post.entity.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	List<Post> findAllByUserId(String userId);
}
