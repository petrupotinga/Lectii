package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {
    private String username;
    private String password;

    // Constructor, getteri și setteri pentru username și password

    public void saveToDatabase() {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "myusername";
        String password = "mypassword";

        String insertQuery = "INSERT INTO users (username, password) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(insertQuery)) {

            // Setarea parametrilor pentru inserție
            statement.setString(1, this.username);
            statement.setString(2, this.password);

            // Executarea interogării de inserție
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Inserția a fost realizată cu succes!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Restul clasei User
}
