package com.example.spring_elastic.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "blog")
public class Author {

    @Id
    private String id;

    private String name;

}
