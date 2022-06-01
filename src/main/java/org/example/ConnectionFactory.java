package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "trickymove";
    public static final String URL = "jdbc:mysql://localhost:3306/bank_service";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }
}
