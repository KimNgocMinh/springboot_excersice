package vn.plusplus.k86.springbootexercise.dao;

import vn.plusplus.k86.springbootexercise.model.Movie;

import java.util.List;

public interface IMovieDao extends GenericDAO<Movie> {
    List<Movie> findByPopularity(Boolean popularity, int page);

    List<Movie> findByStatus(boolean status, int page);

    List<Movie> findAllOrderByRateTop(int page);

    List<Movie> findById(Long id);

    List<Movie> getAllFavoriteMoviesByUser(String userId, int page);
}
