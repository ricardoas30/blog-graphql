package br.com.ricardoasilveira.blog.graphql;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
class PostService {
    Map<String, Post> posts = new HashMap<>();

    /**
     * Criação de um post
     * @param content
     * @return
     */
    Collection<Post> createPost(String content) {
        var newPost = new Post(UUID.randomUUID().toString(), content); // Id do post utilizando o pacote java.utils UUID.
        posts.put(newPost.id(), newPost);
        return posts.values();
    }


    /**
     * Consulta de posts por Id.
     * @param id
     * @return
     */
    Post postById(String id) {
        return posts.get(id);
    }
}

@Service
class CommentService {
    Map<String, Comment> comments = new HashMap<>();

    /**
     * Criação de comentários
     * @param content
     * @param postId
     * @return
     */
    Collection<Comment> createComment(String content, String postId) {
        var newComment = new Comment(UUID.randomUUID().toString(), content, postId);
        comments.put(newComment.id(), newComment);
        return comments.values();
    }

    /**
     * Retorna os comentários de um post por Id.
     * @param postId
     * @return
     */
    public Collection<Comment> findByPost(String postId) {
        return comments.values().stream()
                .filter(comment -> comment.postId().equals(postId)).toList();
    }
}