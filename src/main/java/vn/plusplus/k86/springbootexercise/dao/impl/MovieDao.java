package vn.plusplus.k86.springbootexercise.dao.impl;

import org.springframework.stereotype.Component;
import vn.plusplus.k86.springbootexercise.dao.IMovieDao;
import vn.plusplus.k86.springbootexercise.mapper.MovieMapper;
import vn.plusplus.k86.springbootexercise.model.Movie;

import java.util.List;

@Component
public class MovieDao extends AbstractDAO<Movie> implements IMovieDao {
    private final MovieMapper movieMapper = new MovieMapper();

    @Override
    public List<Movie> findByPopularity(Boolean popularity) {
        String sql = "select * from movies where popularity = ?";
        return query(sql, movieMapper,popularity);

    }

    @Override
    public List<Movie> findByStatus(boolean status) {
        String sql = "select * from movies where status = ?";
        return query(sql,movieMapper,status);
    }

    @Override
    public List<Movie> findAllOrderByRateTop() {
        String sql = "select * from movies order by avg_rate desc ";
        return query(sql, movieMapper);
    }

    @Override
    public List<Movie> findById(Long id) {
        String sql = "select * from movies where id = ?";
        return query(sql, movieMapper, id);
    }


    @Override
    public List<Movie> getAllFavoriteMoviesByUser(String userId) {
            String hql = "select * from movies m " +
                    "left join favorite_movies fm on m.id=fm.movie_id " +
                    "where fm.user_id = ?";
            return query(hql,movieMapper,userId);
        }
}
