package com.example.spring_elastic.repository;

import com.example.spring_elastic.entity.Author;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AuthorRepository extends ElasticsearchRepository<Author, String> {
}
