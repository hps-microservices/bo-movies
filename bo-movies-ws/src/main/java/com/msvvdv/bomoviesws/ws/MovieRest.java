package com.msvvdv.bomoviesws.ws;

import com.msvvdv.bomoviescore.dto.MovieDTO;
import com.msvvdv.bomoviescore.entity.Movie;
import com.msvvdv.bomoviescore.service.MovieService;
import io.swagger.annotations.Api;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    private DozerBeanMapper beanMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@RequestBody MovieDTO movieDTO){
        movieService.save(toEntity(movieDTO));
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MovieDTO>> findAll(){
        return new ResponseEntity(toDto(movieService.findAll()), HttpStatus.OK);
    }


//    @GetMapping(path = "/movie-details",produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<MovieDTO> findMovieDetails(){
//        return toDto(movieService.findAll());
//    }

    private Movie toEntity(MovieDTO dto){
        Movie entity = new Movie();
        beanMapper.map(dto,entity);
        return entity;
    }

    private MovieDTO toDto(Movie movie){
        MovieDTO dto = new MovieDTO();
        beanMapper.map(movie,dto);
        return dto;
    }

    private List<MovieDTO> toDto(List<Movie> users){
        List<MovieDTO> moviesDTO = new ArrayList<>();
        users.forEach(movie->{
            moviesDTO.add(toDto(movie));
        });
        return moviesDTO;
    }
}
