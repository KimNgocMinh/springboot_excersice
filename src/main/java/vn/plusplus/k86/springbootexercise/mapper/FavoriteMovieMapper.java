package vn.plusplus.k86.springbootexercise.mapper;

import vn.plusplus.k86.springbootexercise.model.FavoriteMovies;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FavoriteMovieMapper implements RowMapper<FavoriteMovies> {
    @Override
    public FavoriteMovies mapRow(ResultSet resultSet) {
        FavoriteMovies favoriteMovies = new FavoriteMovies();
        try {
            favoriteMovies.setUserId(resultSet.getString("user_id"));
            favoriteMovies.setMovieId(resultSet.getLong("movie_id"));
            return favoriteMovies;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
