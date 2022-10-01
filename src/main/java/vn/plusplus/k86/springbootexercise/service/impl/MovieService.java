package vn.plusplus.k86.springbootexercise.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.plusplus.k86.springbootexercise.dao.IMovieDao;
import vn.plusplus.k86.springbootexercise.model.Movie;
import vn.plusplus.k86.springbootexercise.service.IMovieService;

import java.util.List;

@Component
public class MovieService implements IMovieService {
    private final IMovieDao movieDao;

    @Autowired
    public MovieService(IMovieDao movieDao) {
        this.movieDao = movieDao;
    }


    @Override
    public List<Movie> getListMovieByPopularities(boolean popular, int page) {
        return movieDao.findByPopularity(popular, page);
    }

    @Override
    public List<Movie> getListMovieByRate(int page) {
        return movieDao.findAllOrderByRateTop(page);
    }

    @Override
    public List<Movie> getListMovieByStatus(boolean status, int page) {
        return movieDao.findByStatus(status, page);
    }
}
