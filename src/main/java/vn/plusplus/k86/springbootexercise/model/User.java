package vn.plusplus.k86.springbootexercise.model;

import java.util.List;

public class User {
    private String phone;
    private String password;
    private String email;

    private List<Rate> ratedMovies;

    private List<Movie> favoriteMovie;

    public User() {
    }

    public User(String phone, String password, String email, List<Movie> favoriteMovie,List<Rate> ratedMovies) {
        this.phone = phone;
        this.password = password;
        this.email = email;
        this.favoriteMovie = favoriteMovie;
        this.ratedMovies = ratedMovies;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Movie> getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(List<Movie> favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }
}
