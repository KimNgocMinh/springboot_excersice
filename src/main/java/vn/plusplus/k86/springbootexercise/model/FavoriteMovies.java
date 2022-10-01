package vn.plusplus.k86.springbootexercise.model;

public class FavoriteMovies {
    private String userId;
    private Long movieId;

    public FavoriteMovies() {
    }

    public FavoriteMovies(Long id, String userId, Long movieId) {
        this.userId = userId;
        this.movieId = movieId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
