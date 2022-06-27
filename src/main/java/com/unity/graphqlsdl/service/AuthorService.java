package com.unity.graphqlsdl.service;

import com.unity.graphqlsdl.dto.AuthorDto;
import com.unity.graphqlsdl.model.Author;
import com.unity.graphqlsdl.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;


    public List<AuthorDto> getAuthors() {
        var authors = authorRepository.findAll();
        return authors.stream()
                .map(author -> {
                    return AuthorDto.builder()
                            .id(author.getId())
                            .name(author.getName())
                            .email(author.getEmail())
                            .build();
                }).toList();
    }

    public AuthorDto getAuthorById(Long id) {
        Author author = authorRepository.findById(id).get();
        return AuthorDto.builder()
                .id(author.getId())
                .name(author.getName())
                .email(author.getEmail())
                .build();
    }


}
