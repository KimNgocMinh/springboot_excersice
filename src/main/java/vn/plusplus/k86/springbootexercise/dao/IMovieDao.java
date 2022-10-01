package vn.plusplus.k86.springbootexercise.dao;

import vn.plusplus.k86.springbootexercise.model.Movie;

import java.util.List;

public interface IMovieDao extends GenericDAO<Movie> {
    List<Movie> findByPopularity(Boolean popularity);

    List<Movie> findByStatus(boolean status);

    List<Movie> findAllOrderByRateTop();

    List<Movie> findById(Long id);

    List<Movie> getAllFavoriteMoviesByUser(String userId);
}
