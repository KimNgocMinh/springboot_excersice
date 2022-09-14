package vn.plusplus.k86.springbootexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    private static final ConnectDatabase INSTANCE = new ConnectDatabase();
    private Connection connection;

    public static ConnectDatabase getInstance() {
        System.out.println("Khởi tạo duy nhất một Instance của ConnectDatabase");
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void connectMySql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/account","root","minh150397");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
