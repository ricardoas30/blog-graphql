package br.com.ricardoasilveira.blog.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Collection;

@Controller
public class ForumController {

    @Autowired
    PostService postService; // injeção do service Post

    @Autowired
    CommentService commentService; // injeção do service Comment

    @SchemaMapping(typeName = "Query", value = "postById") // ou @QueryMapping
    public Post postById(@Argument String id) {
        return postService.postById(id);
    }

    @MutationMapping
    public Collection<Post> createPost(@Argument String content) {
        return postService.createPost(content);
    }

    @MutationMapping
    public Collection<Comment> createComment(@Argument String content, @Argument String postId) {
        return commentService.createComment(content, postId);
    }

    @SchemaMapping
    public Collection<Comment> comments(Post post) {
        return commentService.findByPost(post.id());
    }
}
