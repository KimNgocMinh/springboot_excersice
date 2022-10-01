package vn.plusplus.k86.springbootexercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.plusplus.k86.springbootexercise.model.Movie;
import vn.plusplus.k86.springbootexercise.service.IUserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addfavor")
    public String addMovieToFavorite(@RequestParam long movieId, @RequestParam String userId) {
        return userService.insertMovie(userId, movieId);
    }

    @PostMapping("/delete")
    public String deleteMovieById(@RequestParam long movieId, @RequestParam String userId) {
        return userService.deleteFavoriteMovie(userId, movieId);
    }

    @PostMapping("/rate")
    public String rateMovie(@RequestParam String userId, @RequestParam Long movieId, @RequestParam double score) {
        return userService.rateMovie(userId, movieId, score);
    }

    @PostMapping("{userId}/allfavor")
    public List<Movie> getAllFavoriteMoviesByUser(@PathVariable String userId) {
        return userService.getAllFavoriteMoviesByUser(userId);
    }
}
