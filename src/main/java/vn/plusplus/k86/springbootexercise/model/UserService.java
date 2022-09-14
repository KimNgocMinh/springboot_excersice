package vn.plusplus.k86.springbootexercise.model;

import vn.plusplus.k86.springbootexercise.ConnectDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {
    ConnectDatabase connectDatabase = ConnectDatabase.getInstance();

    public UserService() {

    }

    //thêm tài khoản người dùng vào database nếu hợp lệ, nếu sai trả về lỗi tương ứng
    public String createUser(User user) {
        if (user.getPhone().length()>10||user.getPhone().length()<10) {
            return "Phone number must have 10 digits";
        }
        if (user.getPassword().length()<8) {
            return "Password must be at least 8 characters";
        }
        if (!user.getEmail().contains("@gmail.com")) {
            return "Email must end with @gmail.com";
        }
        if (!checkValidPhone(user.getPhone())) {
            return "Phone number already exists";
        }
        if (!checkValidEmail(user.getEmail())) {
            return "Email already exists";
        }

        try {
            connectDatabase.connectMySql();
            Statement statement = connectDatabase.getConnection().createStatement();
            statement.execute("insert into user values('" + user.getPhone()
                    + "','" + user.getPassword()
                    + "','" + user.getEmail()
                    + "')");
            connectDatabase.getConnection().close();
        } catch (SQLException e) {
            System.out.println("Error");
        }
        return "Successfully";
    }

    //So sánh phone của người dùng nhập vs phone trong database
    public boolean checkValidPhone(String phone) {

        try {
            connectDatabase.connectMySql();
            Statement statement = connectDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select phone from user");
            while (resultSet.next()) {
                if (resultSet.getString("phone").equals(phone)) {
                    return false;
                }
            }
            connectDatabase.getConnection().close();
        } catch (SQLException e) {
            System.out.println("Error");;
        }
        return true;
    }

    //So sánh email của người dùng nhập vs email trong database
    public boolean checkValidEmail(String email) {

        try {
            connectDatabase.connectMySql();
            Statement statement = connectDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select email from user");
            while (resultSet.next()) {
                if (resultSet.getString("email").equals(email)) {
                    return false;
                }
            }
            connectDatabase.getConnection().close();
        } catch (SQLException e) {
            System.out.println("Error");;
        }
        return true;
    }

    //So sánh password của người dùng nhập vs password trong database
    public boolean checkPassword(String password) {
        try {
            connectDatabase.connectMySql();
            Statement statement = connectDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select password from user");
            while (resultSet.next()) {
                if (resultSet.getString("password").equals(password)) {
                    return false;
                }
            }
            connectDatabase.getConnection().close();
        } catch (SQLException e) {
            System.out.println("Error");;
        }
        return true;
    }

    //So sánh phone và password người dùng nhập và trả về String tương ứng
    public String authentication(User unknow) {
        if (checkValidPhone(unknow.getPhone())) {
            return "Account does not exists";
        }
        if (checkPassword(unknow.getPassword())) {
            return "Password does not match";
        }
        return "logged in successfully";
    }
}
