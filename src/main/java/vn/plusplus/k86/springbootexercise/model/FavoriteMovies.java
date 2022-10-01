package vn.plusplus.k86.springbootexercise.model;

public class FavoriteMovies {
    private Long id;
    private String userId;
    private Long movieId;

    public FavoriteMovies() {
    }

    public FavoriteMovies(Long id, String userId, Long movieId) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
