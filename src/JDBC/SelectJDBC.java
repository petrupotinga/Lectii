package JDBC;

import java.sql.*;

public class SelectJDBC {
    public static void main(String[] args) {
        // Configurarea conexiunii la baza de date
        String url = "jdbc:mysql://localhost:3306/baza_de_date";
        String username = "utilizator";
        String password = "parola";
        try {
            // Încărcarea driverului JDBC
            Class.forName("com.mysql.jdbc.Driver");

            // Obținerea conexiunii la baza de date
            Connection connection = DriverManager.getConnection(url, username, password);

            // Declarația SELECT
            String sql = "SELECT * FROM users";

            // Crearea instrucțiunii și execuția ei
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Parcurgerea rezultatelor
            while (resultSet.next()) {
                // Obținerea valorilor din rezultat
                String user = resultSet.getString("username");
                String pass = resultSet.getString("password");

                // Utilizarea valorilor
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("-----------------------");
            }

            // Închiderea resurselor
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

