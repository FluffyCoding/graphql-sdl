package com.unity.graphqlsdl;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Greetings implements GraphQLQueryResolver {


    public String getGreets(String msg) {
        return String.format("Hello %s ", msg);
    }

}
