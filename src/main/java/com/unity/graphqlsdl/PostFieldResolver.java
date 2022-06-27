package com.unity.graphqlsdl;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.unity.graphqlsdl.dto.AuthorDto;
import com.unity.graphqlsdl.dto.PostDto;
import com.unity.graphqlsdl.service.AuthorService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostFieldResolver implements GraphQLResolver<PostDto> {

    private final AuthorService authorService;

    public AuthorDto getAuthor(PostDto postDto) {
        return authorService.getAuthorById(postDto.getAuthor().getId());

    }

}
