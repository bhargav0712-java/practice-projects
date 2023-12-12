package com.practice.demo.controller;

import com.practice.demo.entity.Movie;
import com.practice.demo.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieRepo movieRepo;

    public MovieController(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    @PostMapping("/create")
    public String createMovie(@RequestBody Movie movie){
        movieRepo.save(movie);
        return "new Movie list has been created ";
    }
    @GetMapping
    public List<Movie> getAllList(){
        return movieRepo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id){
        Optional<Movie> movie = movieRepo.findById(id);
        if(movie.isPresent()){
            return ResponseEntity.ok(movie.get());
        }else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/search")
    public List<Movie> getResultByKeyword(@RequestParam String keyword ){
        return movieRepo.searchByKeyword(keyword);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id , @RequestBody Movie upMovie){
        if(movieRepo.existsById(id)){
            upMovie.setId(id);
            return ResponseEntity.ok(movieRepo.save(upMovie));
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id ){
        if(movieRepo.existsById(id)){
            movieRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
