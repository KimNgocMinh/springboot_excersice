package vn.plusplus.k86.springbootexercise.model;

public class Movie {
    private Long id;
    private String movieName;
    private Boolean popularity;
    private Boolean status;
    private Double avgRate;

    private String information;

    public Movie() {
    }

    public Movie(Long id, String movieName, boolean popularity, boolean status, double avgRate, String information) {
        this.id = id;
        this.movieName = movieName;
        this.popularity = popularity;
        this.status = status;
        this.avgRate = avgRate;
        this.information = information;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Boolean getPopularity() {
        return popularity;
    }

    public void setPopularity(Boolean popularity) {
        this.popularity = popularity;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(Double avgRate) {
        this.avgRate = avgRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}

