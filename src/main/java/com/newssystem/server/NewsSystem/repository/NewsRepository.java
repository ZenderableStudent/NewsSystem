package com.newssystem.server.NewsSystem.repository;

import com.newssystem.server.NewsSystem.model.News;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Cacheable("news")
public interface NewsRepository  extends MongoRepository<News, String>  {

}
