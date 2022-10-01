package vn.plusplus.k86.springbootexercise.dao.impl;

import vn.plusplus.k86.springbootexercise.dao.IUserDao;
import vn.plusplus.k86.springbootexercise.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao extends AbstractDAO<User> implements IUserDao  {


    @Override
    public boolean checkValidPhone(String phone) {
        String sql = "select phone from user";
        String label = "phone";
        return checkAcount(sql, phone, label);
    }

    @Override
    public boolean checkValidPassword(String password) {
        String sql = "select password from user";
        String label = "password";
        return checkAcount(sql, password, label);
    }

    @Override
    public boolean checkValidEmail(String email) {
        String sql = "select email from user";
        String label = "email";
        return checkAcount(sql, email, label);
    }

    @Override
    public void createUser(User unknow) {
        String sql = "insert into user values (?, ?, ?)";
        update(sql,unknow.getPhone(),unknow.getPassword(),unknow.getEmail());
    }

    public boolean checkAcount(String sql, String parameter,String label) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                if (resultSet.getString(label).equals(parameter)) {
                    return false;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                System.out.println("Error");
            }
        }
        return true;
    }

    @Override
    public void insertFavoriteMovie(String unknownPhone, Long movieId) {
        String sql = "insert into favorite_movies (user_id, movie_id) values (?, ?)";
        update(sql, unknownPhone, movieId);
    }



    @Override
    public void updateFavoriteMovie(Long favoriteMovieId, Long movieId) {
        String sql = "update favorite_movies set movie_id = ? where id = ?";
        update(sql,favoriteMovieId,movieId);
    }

    @Override
    public void deleteFavoriteMovie(String userId, Long movieId) {
        String sql = "delete from favorite_movies where user_id = ? and movie_id = ?";
        update(sql,userId, movieId);
    }


}

