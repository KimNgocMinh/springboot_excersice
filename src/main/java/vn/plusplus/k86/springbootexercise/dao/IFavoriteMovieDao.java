package vn.plusplus.k86.springbootexercise.dao;

import vn.plusplus.k86.springbootexercise.model.FavoriteMovies;

public interface IFavoriteMovieDao extends GenericDAO<FavoriteMovies> {
    boolean checkIsValid(String phone, Long movieId);
}
