package vn.plusplus.k86.springbootexercise;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor
@Getter @Setter
public class ConnectDatabase {
    private static final ConnectDatabase INSTANCE = new ConnectDatabase();
    private Connection connection;

    public static ConnectDatabase getInstance() {
        return INSTANCE;
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
