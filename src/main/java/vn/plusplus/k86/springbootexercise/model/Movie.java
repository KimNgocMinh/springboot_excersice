package vn.plusplus.k86.springbootexercise.model;

import java.sql.Timestamp;

public class Movie {
    private Long id;
    private String movieName;
    private Integer popularity;
    private Integer status;
    private Double rateTop;

    private String information;

    private Timestamp createdTimestamp;

    private Timestamp lastUpdatedTimestamp;

    public Movie() {
    }

    public Movie(Long id,String movieName, int popularity, int status, double rateTop,String information, Timestamp createdTimestamp, Timestamp lastUpdatedTimestamp) {
        this.id = id;
        this.movieName = movieName;
        this.popularity = popularity;
        this.status = status;
        this.rateTop = rateTop;
        this.information = information;
        this.createdTimestamp =createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int isPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getRateTop() {
        return rateTop;
    }

    public void setRateTop(double rateTop) {
        this.rateTop = rateTop;
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

    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public Timestamp getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    public void setLastUpdatedTimestamp(Timestamp lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }
}
