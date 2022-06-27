package com.unity.graphqlsdl.service;

import com.unity.graphqlsdl.dto.PostDto;
import com.unity.graphqlsdl.model.Post;
import com.unity.graphqlsdl.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<PostDto> getAllPostByAuthorId(Long id) {
        var posts = postRepository.findAllByAuthor_Id(id);

        return posts.stream()
                .map(post -> PostDto.builder()
                        .id(post.getId())
                        .title(post.getTitle())
                        .content(post.getContent())
                        .category(post.getCategory())
                        .category(post.getCategory())
                        .build()).toList();
    }


    public List<PostDto> findPostByAuthor(int count, int offset, Long authorId) {
        PageRequest of = PageRequest.of(offset, count);
        Page<Post> posts = postRepository.findAll(of);
        return posts.stream()
                .map(post -> PostDto.builder()
                        .id(post.getId())
                        .title(post.getTitle())
                        .content(post.getContent())
                        .category(post.getCategory())
                        .category(post.getCategory())
                        .build()).toList();
    }
}
