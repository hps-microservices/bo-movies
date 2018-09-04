package com.msvvdv.bomoviesws.ws;

import com.msvvdv.bomoviescore.dto.MovieDTO;
import com.msvvdv.bomoviescore.entity.Movie;
import com.msvvdv.bomoviescore.service.MovieService;
import io.swagger.annotations.Api;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("movie")
@Api(value = "Manage Movies", tags = "movie")
public class MovieRest {

    @Autowired
    private MovieService movieService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody MovieDTO userDTO){
        movieService.save(convertToEntity(userDTO));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MovieDTO> findMovieDetails(){
        return convertToDto(movieService.findAll());
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MovieDTO> findAll(){
        return convertToDto(movieService.findAll());
    }

    private Movie convertToEntity(MovieDTO movieDto){
        return modelMapper.map(movieDto, Movie.class);
    }

    private MovieDTO convertToDto(Movie movie) {
        return modelMapper.map(movie, MovieDTO.class);
    }

    private List<MovieDTO> convertToDto(List<Movie> users) {
        List<MovieDTO> moviesDTO = new ArrayList<>();
        users.forEach(u->{
            moviesDTO.add(convertToDto(u));
        });
        return moviesDTO;
    }
}
