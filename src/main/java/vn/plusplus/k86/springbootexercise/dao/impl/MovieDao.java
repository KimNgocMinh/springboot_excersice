package vn.plusplus.k86.springbootexercise.dao.impl;

import org.springframework.stereotype.Component;
import vn.plusplus.k86.springbootexercise.dao.IMovieDao;
import vn.plusplus.k86.springbootexercise.mapper.MovieMapper;
import vn.plusplus.k86.springbootexercise.model.Movie;

import java.util.List;

@Component
public class MovieDao extends AbstractDAO<Movie> implements IMovieDao {
    private static final MovieMapper movieMapper = new MovieMapper();

    @Override
    public List<Movie> findByPopularity(Boolean popularity, int page) {
        String sql = "select * from movies where popularity = ? limit 3 offset ? ";
        return query(sql, movieMapper, popularity, page);

    }

    @Override
    public List<Movie> findByStatus(boolean status, int page) {
        String sql = "select * from movies where status = ? limit 3 offset ? ";
        return query(sql,movieMapper,status, page);
    }

    @Override
    public List<Movie> findAllOrderByRateTop(int page) {
        String sql = "select * from movies order by avg_rate desc limit 3 offset ? ";
        return query(sql, movieMapper,page);
    }

    @Override
    public List<Movie> findById(Long id) {
        String sql = "select * from movies where id = ?";
        return query(sql, movieMapper, id);
    }


    @Override
    public List<Movie>  getAllFavoriteMoviesByUser(String userId, int page) {
            String hql = "select * from movies m " +
                    "left join favorite_movies fm on m.id=fm.movie_id " +
                    "where fm.user_id = ? " +
                    "limit 3 offset ? ";
            return query(hql,movieMapper,userId, page);
        }
}
