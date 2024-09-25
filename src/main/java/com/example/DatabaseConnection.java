package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnection {
    private String url = "jdbc:mysql://localhost:3306/login_app";
    private String user = "root"; // altere se necessário
    private String password ="12345"; // altere se necessário

    public boolean validateUser(String username, String password) {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
