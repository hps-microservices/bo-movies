package com.msvvdv.bomoviescore.service;

import com.msvvdv.bomoviescore.entity.Movie;
import com.msvvdv.bomoviescore.entity.MovieDetails;

import java.util.List;

public interface MovieService {
    void save(Movie user);
    List<Movie> findAll();
    MovieDetails findMovieDetails();
}
