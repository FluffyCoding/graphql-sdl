package com.unity.graphqlsdl;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.unity.graphqlsdl.dto.AuthorDto;
import com.unity.graphqlsdl.dto.PostDto;
import com.unity.graphqlsdl.model.Post;
import com.unity.graphqlsdl.service.AuthorService;
import com.unity.graphqlsdl.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.awt.print.Pageable;
import java.util.List;


@Component
@RequiredArgsConstructor
public class AuthorQueryResolver implements GraphQLQueryResolver {

    private final AuthorService authorService;
    private final PostService postService;

    public List<AuthorDto> getAuthors() {
        return authorService.getAuthors();
    }

//    public List<PostDto> getRecentPosts(int count, int offset, int authorId) {
//
//            postService.findPostByAuthor(count,offset,authorId);
//
//    }

}
