package com.msvvdv.bomoviescore.service;

import com.msvvdv.bomoviescore.entity.Movie;

import java.util.List;

public interface MovieService {
    void save(Movie user);
    List<Movie> findAll();
}
