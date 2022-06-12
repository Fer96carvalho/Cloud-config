package com.prova.movie.Controller;

import com.prova.movie.Entity.Movies;
import com.prova.movie.Service.IMovies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private IMovies iMovies;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody() Movies movies){
        this.iMovies.save(movies);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{genre}")
    public List<Movies> findMovie(@PathVariable String genre){
       return this.iMovies.findByGenre(genre);
    }
}
