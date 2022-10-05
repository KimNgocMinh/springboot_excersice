package vn.plusplus.k86.springbootexercise.dao.impl;

import vn.plusplus.k86.springbootexercise.dao.IFavoriteMovieDao;
import vn.plusplus.k86.springbootexercise.mapper.FavoriteMovieMapper;
import vn.plusplus.k86.springbootexercise.model.FavoriteMovies;

public class FavoriteMovieDao extends AbstractDAO<FavoriteMovies> implements IFavoriteMovieDao {
    private static final FavoriteMovieMapper favoriteMovieMapper = new FavoriteMovieMapper();

    @Override
    public boolean checkIsValid(String phone, Long movieId) {
        String sql = "select * from favorite_movies";
        for (FavoriteMovies favoriteMovies : query(sql, favoriteMovieMapper)) {
            if (favoriteMovies.getUserId().equals(phone) &&
                    favoriteMovies.getMovieId().equals(movieId)) {
                return true;
            }
        }
        return false;
    }
}
