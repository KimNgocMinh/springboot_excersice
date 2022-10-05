package vn.plusplus.k86.springbootexercise.mapper;

import vn.plusplus.k86.springbootexercise.model.Rate;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RateMapper implements RowMapper<Rate>{
    @Override
    public Rate mapRow(ResultSet resultSet) {
        Rate rate = new Rate();
        try {
            rate.setUserId(resultSet.getString("user_id"));
            rate.setMovieId(resultSet.getLong("movie_id"));
            rate.setScore(resultSet.getDouble("score"));
            return rate;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
