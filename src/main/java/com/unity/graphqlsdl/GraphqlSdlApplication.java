package com.unity.graphqlsdl;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.unity.graphqlsdl.model.Author;
import com.unity.graphqlsdl.model.Post;
import com.unity.graphqlsdl.repository.AuthorRepository;
import com.unity.graphqlsdl.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@SpringBootApplication
public class GraphqlSdlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlSdlApplication.class, args);
    }


}


