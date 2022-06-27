package com.unity.graphqlsdl.repository;

import com.unity.graphqlsdl.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByAuthor_Id(Long id);

    Page<Post> findAllByAuthor_Id(Long id, Pageable pageable);
}
