package vn.plusplus.k86.springbootexercise.service;

import vn.plusplus.k86.springbootexercise.model.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> getListMovieByPopularities(boolean popular);

    List<Movie> getListMovieByRate();

    List<Movie> getListMovieByStatus(boolean status);
}
