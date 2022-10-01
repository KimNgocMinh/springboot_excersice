package vn.plusplus.k86.springbootexercise.mapper;

import vn.plusplus.k86.springbootexercise.model.Movie;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieMapper implements RowMapper<Movie>{
    @Override
    public Movie mapRow(ResultSet resultSet) {
        Movie movie = new Movie();
        try {
            movie.setId(resultSet.getLong("id"));
            movie.setMovieName(resultSet.getString("movie_name"));
            movie.setPopularity(resultSet.getInt("popularity"));
            movie.setStatus(resultSet.getInt("status"));
            movie.setRateTop(resultSet.getDouble("rate_top"));
            movie.setInformation(resultSet.getString("information"));
            return movie;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
