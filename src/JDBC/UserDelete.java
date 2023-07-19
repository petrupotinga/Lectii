package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelete {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/NewDB";
        String username = "postgres";
        String password = "2015";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "DELETE FROM person WHERE name = ?";

            // Crearea obiectului PreparedStatement
            PreparedStatement statement = connection.prepareStatement(sql);

            // Setarea valorii parametrului
            statement.setString(1, "John");

            // Executarea instrucțiunii SQL
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Utilizatorul a fost șters cu succes.");
            } else {
                System.out.println("Nu s-a găsit utilizatorul specificat.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
