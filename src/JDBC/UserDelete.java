package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelete {
    // Metoda pentru ștergerea unui utilizator în baza de date
    public void deleteUser(String username) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Obținerea conexiunii la baza de date
            connection = YourDatabaseConnection.getConnection();

            // Definirea interogării SQL pentru ștergere
            String query = "DELETE FROM users WHERE username = ?";

            // Crearea obiectului PreparedStatement
            statement = connection.prepareStatement(query);

            // Setarea valorilor parametrilor
            statement.setString(1, username);

            // Executarea interogării de ștergere
            statement.executeUpdate();

            System.out.println("Utilizatorul a fost șters din baza de date.");
        } catch (SQLException e) {
            System.out.println("A apărut o eroare la ștergerea utilizatorului: " + e.getMessage());
        } finally {
            // Închiderea obiectelor PreparedStatement și Connection
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("A apărut o eroare la închiderea resurselor: " + e.getMessage());
            }
        }
    }
}
