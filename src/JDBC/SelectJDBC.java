package JDBC;

import java.sql.*;

public class SelectJDBC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/database_name";
        String username = "your_username";
        String password = "your_password";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Se încearcă stabilirea conexiunii cu baza de date
            connection = DriverManager.getConnection(url, username, password);

            // Se creează un obiect Statement pentru a executa interogările SQL
            statement = connection.createStatement();

            // Se definește interogarea SELECT
            String query = "SELECT * FROM user";

            // Se execută interogarea și se obține un obiect ResultSet
            resultSet = statement.executeQuery(query);

            // Se parcurge rezultatul și se afișează datele
            while (resultSet.next()) {
                resultSet.getString("username");
                resultSet.getString("password");

                System.out.println("Username: " + username + ", Password: " + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Se închid resursele
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
