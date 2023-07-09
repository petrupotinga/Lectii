package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UserUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "myusername";
        String password = "mypassword";

        String newPassword = "newpassword";
        String usernameToUpdate = "usernameToUpdate";

        try {
            // Pasul 1: Conectarea la baza de date
            Connection connection = DriverManager.getConnection(url, username, password);

            // Pasul 2: Construirea interogării UPDATE
            String query = "UPDATE users SET password = ? WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            // Pasul 3: Setarea parametrilor
            statement.setString(1, newPassword);
            statement.setString(2, usernameToUpdate);

            // Pasul 4: Executarea interogării UPDATE
            int rowsAffected = statement.executeUpdate();
            System.out.println("Numărul de înregistrări actualizate: " + rowsAffected);

            // Pasul 5: Închiderea resurselor
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}