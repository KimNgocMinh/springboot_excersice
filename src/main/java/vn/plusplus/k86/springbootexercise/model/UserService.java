package vn.plusplus.k86.springbootexercise.model;

import vn.plusplus.k86.springbootexercise.ConnectDatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {
    ConnectDatabase connectDatabase;

    public UserService() {

    }

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

        try {
            ConnectDatabase.getInstance().connectMySql();
            Statement statement = connectDatabase.getConnection().createStatement();
            statement.execute("insert into user values('" + user.getPhone()
                    + "','" + user.getPassword()
                    + "','" + user.getEmail()
                    + "')");
            connectDatabase.getConnection().close();
        } catch (SQLException e) {
            System.out.println("lỗi rồi");
        }
        return "Successfully";
    }

    public void checkValidUser(String phone, String password) {

    }
}
