
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            // Incarcarea driverul PostgreSQL JDBC
            Class.forName("org.postgresql.Driver");

            // Definirea detaliile de conexiune la baza de date
            String url = "jdbc:postgresql://localhost:5432/NewDB";
            String username = "postgres";
            String password = "2015";

            // Stabilirea conexiunii
            Connection connection = DriverManager.getConnection(url, username, password);

            // Crearea instrucțiunii SQL pentru crearea tabelei
            String createTableSQL = "CREATE TABLE users ("
                    + "id SERIAL PRIMARY KEY,"
                    + "name VARCHAR(50),"
                    + "email VARCHAR(50)"
                    + ")";

            // Crearea obiectul Statement și executarea instrucțiunii SQL
            Statement statement = connection.createStatement();
            statement.executeUpdate(createTableSQL);

            // Închiderea conexiunii și resursele
            statement.close();
            connection.close();

            System.out.println("Tabela a fost creată cu succes.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
