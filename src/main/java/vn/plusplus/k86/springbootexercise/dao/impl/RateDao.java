package vn.plusplus.k86.springbootexercise.dao.impl;


import vn.plusplus.k86.springbootexercise.dao.IRateDao;
import vn.plusplus.k86.springbootexercise.model.Rate;

public class RateDao extends AbstractDAO<Rate> implements IRateDao {
    @Override
    public void rateMovie(String userId, Long movieId, double score) {
        String hql = "insert into rate values (?, ?, ?)";
        update(hql, userId, movieId, score);
    }
}
