package com.msvvdv.bomoviescore.repository;

import com.msvvdv.bomoviescore.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MovieRepository extends MongoRepository<Movie,String> {}
