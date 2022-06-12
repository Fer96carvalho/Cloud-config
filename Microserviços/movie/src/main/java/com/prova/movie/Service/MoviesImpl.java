package com.prova.movie.Service;

import com.prova.movie.Entity.Movies;
import com.prova.movie.Repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesImpl implements IMovies{
    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public void save (Movies movies){
        moviesRepository.save(movies);
    }

    @Override
    public List<Movies> findByGenre(String genre) {
        return moviesRepository.findByGenre(genre);
    }

}
