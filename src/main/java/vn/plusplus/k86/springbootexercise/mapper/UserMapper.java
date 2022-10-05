package vn.plusplus.k86.springbootexercise.mapper;

import vn.plusplus.k86.springbootexercise.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet resultSet) {
        User user = new User();
        try {
                user.setPhone(resultSet.getString("phone"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
