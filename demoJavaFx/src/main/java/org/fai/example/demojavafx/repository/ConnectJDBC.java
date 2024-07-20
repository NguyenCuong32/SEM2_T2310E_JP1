package org.fai.example.demojavafx.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectJDBC {
    private static ConnectJDBC instance;
    private Connection connection;
    private String host = "localhost:3306";
    private String db = "03_university";
    private String user = "root";
    private String pass = "1234@Abc";
    private String url = "jdbc:mysql://" + host + "/" + db;

    private ConnectJDBC() {
        try {
            this.connection = DriverManager.getConnection(url, user, pass);
            if (this.connection != null && !this.connection.isClosed()) {
                System.out.println("Connected");
            } else {
                System.out.println("Not Connected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ConnectJDBC getInstance() {
        if (instance == null) {
            synchronized (ConnectJDBC.class) {
                if (instance == null) {
                    instance = new ConnectJDBC();
                }
            }
        }
        return instance;
    }
    public Connection getConnection() {
        return connection;
    }
}
