package JDBC;

import java.sql.*;

public class CRUD {

    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "myusername";
    private static final String PASSWORD = "mypassword";

    public static void main(String[] args) {
        updateUser("john.doe", "1234");
    }

    private static void updateUser(String username, String password) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "UPDATE users SET password = ? WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, username);
            statement.setString(2, password);

            int rowsAffected = statement.executeUpdate();

            System.out.println("Numărul de înregistrări actualizate: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createUserTable() {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {

            String createTableQuery = "CREATE TABLE users (" +
                    "id SERIAL PRIMARY KEY," +
                    "username VARCHAR(50) NOT NULL," +
                    "password VARCHAR(50) NOT NULL" +
                    ")";

            statement.executeUpdate(createTableQuery);

            System.out.println("Table 'users' created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}