package vn.plusplus.k86.springbootexercise.service;

import vn.plusplus.k86.springbootexercise.model.Movie;
import vn.plusplus.k86.springbootexercise.model.User;

import java.util.List;

public interface IUserService {
    String createUser(User unknow);

    String authentication(User unknow);

    String insertMovie(String unknownPhone, Long movieId);


    String deleteFavoriteMovie(String userId, Long movieId);


    String rateMovie(String userId, Long movieId, Double rate);

    List<Movie> getAllFavoriteMoviesByUser(String userId, int page);
}
