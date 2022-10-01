package vn.plusplus.k86.springbootexercise.service.impl;

import org.springframework.stereotype.Component;
import vn.plusplus.k86.springbootexercise.dao.impl.MovieDao;
import vn.plusplus.k86.springbootexercise.dao.impl.RateDao;
import vn.plusplus.k86.springbootexercise.dao.impl.UserDao;
import vn.plusplus.k86.springbootexercise.model.Movie;
import vn.plusplus.k86.springbootexercise.model.User;
import vn.plusplus.k86.springbootexercise.service.IUserService;

import java.util.List;

@Component
public class UserService implements IUserService {
    private final UserDao userDao = new UserDao();

    private final MovieDao movieDao = new MovieDao();

    private final RateDao rateDao = new RateDao();

    //thêm tài khoản người dùng vào database nếu hợp lệ, nếu sai trả về lỗi tương ứng
    @Override
    public String createUser(User unknow) {
        if (unknow.getPhone().length()>10||unknow.getPhone().length()<10) {
            return "Phone number must have 10 digits";
        }
        if (unknow.getPassword().length()<8) {
            return "Password must be at least 8 characters";
        }
        if (!unknow.getEmail().contains("@gmail.com")) {
            return "Email must end with @gmail.com";
        }
        if (!userDao.checkValidPhone(unknow.getPhone())) {
            return "Phone number already exists";
        }
        if (!userDao.checkValidEmail(unknow.getEmail())) {
            return "Email already exists";
        }
        userDao.createUser(unknow);
        return "Successfully";
    }

    //So sánh phone và password người dùng nhập và trả về String tương ứng

    @Override
    public String authentication(User unknow) {
        if (userDao.checkValidPhone(unknow.getPhone())) {
            return "Account does not exists";
        }
        if (userDao.checkValidPassword(unknow.getPassword())) {
            return "Password does not match";
        }
        return "logged in successfully";
    }

    @Override
    public String insertMovie(String unknownPhone, Long movieId) {
        userDao.insertFavoriteMovie(unknownPhone,movieId);
        return "Added movie successfully";
    }


    @Override
    public String deleteFavoriteMovie(String userId, Long movieId) {
        userDao.deleteFavoriteMovie(userId, movieId);
        return "Deteled movie successfully";
    }


    @Override
    public String rateMovie(String userId,Long movieId, Double ratePoint) {
        rateDao.rateMovie(userId, movieId, ratePoint);
        return "Rated successfully";
    }

    @Override
    public List<Movie> getAllFavoriteMoviesByUser(String userId, int page) {
        return movieDao.getAllFavoriteMoviesByUser(userId, page);
    }
}
