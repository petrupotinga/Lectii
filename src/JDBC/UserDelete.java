package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelete {
    // Metoda pentru ștergerea unui utilizator în baza de date
    public void deleteUser(int userId) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // Obținerea conexiunii la baza de date
            connection = YourDatabaseConnection.getConnection();

            // Definirea interogării SQL pentru ștergere
            String query = "DELETE FROM users WHERE id = ?";

            // Crearea obiectului PreparedStatement
            statement = connection.prepareStatement(query);

            // Setarea valorii parametrului
            statement.setInt(1, userId);

            // Executarea interogării de ștergere
            statement.executeUpdate();

            System.out.println("Utilizatorul cu ID-ul " + userId + " a fost șters din baza de date.");
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
