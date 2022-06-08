package com.persistence.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static Connection conn = null;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/java13_shopping";
    private static final String USER = "root";
    private static final String PASS = "07102001";

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = DBProvider.getProps();
//                Class.forName(DRIVER);
                Class.forName(props.getProperty("DRIVER"));
                conn = DriverManager.getConnection(props.getProperty("URL")
                        , props.getProperty("USER")
                        , props.getProperty("PASS"));
//                conn = DriverManager.getConnection(URL, USER, PASS);
            } catch (ClassNotFoundException | SQLException | IOException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        System.out.println(conn);
    }
}
