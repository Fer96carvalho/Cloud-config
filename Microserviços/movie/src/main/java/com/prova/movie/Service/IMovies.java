package com.prova.movie.Service;

import com.prova.movie.Entity.Movies;

import java.util.List;

public interface IMovies {

    void save(Movies movies);
    List<Movies> findByGenre(String genre);
}
