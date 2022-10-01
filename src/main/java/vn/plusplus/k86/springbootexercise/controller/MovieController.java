package vn.plusplus.k86.springbootexercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.plusplus.k86.springbootexercise.model.Movie;
import vn.plusplus.k86.springbootexercise.service.IMovieService;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final IMovieService movieService;

    @Autowired
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/ratetop")
    public List<Movie> getMoviesOrderByRateTop() {
        return movieService.getListMovieByRate();
    }

    @PostMapping("/status")
    public List<Movie> getMoviesByStatus(@RequestParam boolean status) {
        return movieService.getListMovieByStatus(status);
    }

    @PostMapping("/popularites")
    public List<Movie> getMoviesByPopular(@RequestParam boolean status) {
        return movieService.getListMovieByPopularities(status);
    }
}
