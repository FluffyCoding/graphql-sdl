package com.unity.graphqlsdl.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "author",
            cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = Post.class)
    private List<Post> posts;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
