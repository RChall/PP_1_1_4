package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    //private static final String DB_DRIVER =;
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rogst";

    public static Connection getConnection() {
        Driver driver;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    // реализуйте настройку соеденения с БД
}
