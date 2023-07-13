package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEX {
    // Informațiile de conexiune la baza de date
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/nume_baza_de_date";
    private static final String USERNAME = "nume_utilizator";
    private static final String PASSWORD = "parola_utilizator";

    public static void main(String[] args) {
        // Creați un obiect User cu valorile corespunzătoare
        User user = new User("john.doe", "password123");

        try (Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
            // Definiți interogarea SQL pentru inserarea unui utilizator
            String insertQuery = "INSERT INTO users (username, password) VALUES (?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
                // Setarea valorilor parametrilor în declarația SQL pregătită
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());

                // Executarea interogării SQL de inserare
                int rowsInserted = statement.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("Inserarea a fost realizată cu succes!");
                } else {
                    System.out.println("Inserarea a eșuat!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Clasa User care conține informațiile despre utilizator
    static class User {
        String username;
        String password;
        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
        public String getUsername() {
            return username;
        }
        public String getPassword() {
            return password;
        }
    }
}


