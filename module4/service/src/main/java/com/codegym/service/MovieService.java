package com.codegym.service;
import com.codegym.dao.entity.Movie;
import java.util.List;
public interface MovieService {
    List<Movie> getMovies();
    Movie getIdMovie(int id);
    //    List<Movie> getSearchMoviesByName(String name);
//
//    List<Movie> getSearchMoviesByActor(String actor);
//
//    List<Movie> getSearchMoviesByAuthor(String author);
    List<Movie> getSearchAll(String keyword);
    List<Movie> getCategoryMovies(String category);
}