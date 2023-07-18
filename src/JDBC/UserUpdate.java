package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UserUpdate {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/NewDB";
        String username = "postgres";
        String password = "2015";

        int newpersonid = 1;
        String newname = "ION";

        try {
            // Pasul 1: Conectarea la baza de date
            Connection connection = DriverManager.getConnection(url, username, password);

            // Pasul 2: Construirea interogării UPDATE
            String query = "UPDATE person SET name = ? WHERE personid = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            // Pasul 3: Setarea parametrilor
            statement.setString(1, newname);
            statement.setInt(2, newpersonid);

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