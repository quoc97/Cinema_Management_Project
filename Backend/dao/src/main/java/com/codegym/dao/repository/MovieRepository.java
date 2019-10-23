package com.codegym.dao.repository;

import com.codegym.dao.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    //List<Movie> findAllByNameMovieContaining(String name);
//
//List<Movie> findAllByActorContaining(String actor);
//
//List<Movie> findAllByAuthorContaining(String author);
    List<Movie> findAllByCategoryMovieContaining(String category);
    List<Movie> findAllByNameMovieContainingOrActorContainingOrAuthorContaining(String name, String actor, String author);
}