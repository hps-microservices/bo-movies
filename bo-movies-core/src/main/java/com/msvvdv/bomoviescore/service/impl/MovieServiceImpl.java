package com.msvvdv.bomoviescore.service.impl;

import com.msvvdv.bomoviescore.entity.Movie;
import com.msvvdv.bomoviescore.repository.MovieRepository;
import com.msvvdv.bomoviescore.service.MovieService;
import com.msvvdv.bomoviescore.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private SequenceService sequenceService;

    private final static String SEQUENCE_USER_KEY = "user";

    @Override
    public void save(Movie movie) {
        movie.setId(sequenceService.getNextSequenceId(SEQUENCE_USER_KEY));
        movieRepository.save(movie);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
