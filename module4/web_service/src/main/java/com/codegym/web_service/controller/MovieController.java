package com.codegym.web_service.controller;
import com.codegym.dao.entity.Movie;
import com.codegym.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    public MovieService movieService;
    @GetMapping(value = {"/listMovie"})
    private ResponseEntity<?> getListMovies() {
        List<Movie> movieList = movieService.getMovies();
        return ResponseEntity.ok(movieList);
    }
    @GetMapping(value = {"/detailMovie/{id}"})
    public ResponseEntity<Movie> getMovie(@PathVariable("id") int id) {
        Movie movie = movieService.getIdMovie(id);
        return ResponseEntity.ok(movie);
    }
//        @GetMapping(value = {"/searchMovie/{name}"})
//    public ResponseEntity<?> getSearchMovie(@PathVariable("name") String name) {
//        List<Movie> movies = movieService.getSearchMoviesByName(name);
//        return ResponseEntity.ok(movies);
//    }
//
//    @GetMapping(value = {"/searchMovie1/{actor}"})
//    public ResponseEntity<?> getSearchMovie1(@PathVariable("actor") String actor) {
//        List<Movie> movies = movieService.getSearchMoviesByActor(actor);
//        return ResponseEntity.ok(movies);
//    }
//
//    @GetMapping(value = {"/searchMovie2/{author}"})
//    public ResponseEntity<?> getSearchMovie2(@PathVariable("author") String author) {
//        List<Movie> movies = movieService.getSearchMoviesByAuthor(author);
//        return ResponseEntity.ok(movies);
//    }
//    @GetMapping(value = {"/categoryMovie/{category}"})
//    public ResponseEntity<?> getCategoryMovie(@PathVariable("category") String category) {
//        List<Movie> cateMovies = movieService.getCategoryMovies(category);
//        return ResponseEntity.ok(cateMovies);
//    }
//    @GetMapping(value = {"/searchAll/{keyword}"})
//    public  ResponseEntity<?> getSearch(@PathVariable("keyword") String keyword){
//        List<Movie> movies = movieService.getSearchAll(keyword);
//        return ResponseEntity.ok(movies);
//    }
}