package com.codegym.service.impl;

import com.codegym.dao.entity.Movie;
import com.codegym.dao.repository.MovieRepository;
import com.codegym.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;
    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
    @Override
    public Movie getIdMovie(int id) {
        return movieRepository.findById(id).orElse(null);
    }
    @Override
    public List<Movie> getSearchAll(String keyword) {
        return movieRepository.findAllByNameMovieContainingOrActorContainingOrAuthorContaining(keyword,keyword,keyword);
    }
    //    @Override
//    public List<Movie> getSearchMoviesByName(String name) {
//        return movieRepository.findAllByNameMovieContaining(name);
//    }
//
//    @Override
//    public List<Movie> getSearchMoviesByActor(String actor) {
//        return movieRepository.findAllByActorContaining(actor);
//    }
//
//    @Override
//    public List<Movie> getSearchMoviesByAuthor(String author) {
//        return movieRepository.findAllByAuthorContaining(author);
//    }
    @Override
    public List<Movie> getCategoryMovies(String category) {
        return movieRepository.findAllByCategoryMovieContaining(category);
    }
}