package vn.plusplus.k86.springbootexercise.service;

import vn.plusplus.k86.springbootexercise.model.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> getListMovieByPopularities(boolean popular, int page);

    List<Movie> getListMovieByRate(int page);

    List<Movie> getListMovieByStatus(boolean status, int page);
}
