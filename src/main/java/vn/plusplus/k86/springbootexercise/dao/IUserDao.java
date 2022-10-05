package vn.plusplus.k86.springbootexercise.dao;

import vn.plusplus.k86.springbootexercise.model.User;


public interface IUserDao {

    boolean checkValidPhone(String phone);

    boolean checkValidPassword(String password);

    boolean checkValidEmail(String email);

    void createUser(User unknow);

    void updateFavoriteMovie(Long favoriteMovieId,   Long movieId);

    void deleteFavoriteMovie(String userId, Long movieId);

    void insertFavoriteMovie(String userId, Long movieId);

}
