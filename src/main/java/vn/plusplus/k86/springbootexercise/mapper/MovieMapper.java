package vn.plusplus.k86.springbootexercise.mapper;

import vn.plusplus.k86.springbootexercise.model.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieMapper implements RowMapper<Movie>{
    @Override
    public Movie mapRow(ResultSet resultSet) {
        Movie movie = new Movie();
        try {
            movie.setId(resultSet.getLong("id"));
            movie.setMovieName(resultSet.getString("movie_name"));
            movie.setPopularity(resultSet.getBoolean("popularity"));
            movie.setStatus(resultSet.getBoolean("status"));
            movie.setAvgRate(resultSet.getDouble("avg_rate"));
            movie.setInformation(resultSet.getString("information"));
            return movie;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
