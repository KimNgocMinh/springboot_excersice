package vn.plusplus.k86.springbootexercise.dao;

import vn.plusplus.k86.springbootexercise.model.Rate;

public interface IRateDao extends GenericDAO<Rate> {

    void rateMovie(String userId, Long movieId, double score);
}
