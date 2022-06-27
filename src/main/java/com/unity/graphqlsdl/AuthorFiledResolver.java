package com.unity.graphqlsdl;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.unity.graphqlsdl.dto.AuthorDto;
import com.unity.graphqlsdl.dto.PostDto;
import com.unity.graphqlsdl.service.AuthorService;
import com.unity.graphqlsdl.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class AuthorFiledResolver implements GraphQLResolver<AuthorDto> {

    private final PostService postService;

    public List<PostDto> getPosts(AuthorDto authorDto) {
        return postService.getAllPostByAuthorId(authorDto.getId());

    }

}
