package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEX {
    public static void main(String[] args) {
        // Definirea informațiilor de conexiune la baza de date
        String url = "jdbc:postgresql://localhost:5432/NewDB";
        String username = "postgres";
        String password = "2015";

        // Crearea obiectului User cu valorile corespunzătoare
        User user = new User(2, "John");

        // Încercarea realizării inserării
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Definirea instrucțiunii SQL cu parametri
            String insertQuery = "INSERT INTO person (personid, name) VALUES (?, ?)";

            // Crearea obiectului PreparedStatement
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                // Setarea valorilor parametrilor în instrucțiunea preparată
                preparedStatement.setInt(1, user.getPersonId());
                preparedStatement.setString(2, user.getName());

                // Execuția instrucțiunii de INSERT
                preparedStatement.executeUpdate();

                System.out.println("Inserarea a fost realizată cu succes.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class User {
    private int personId;
    private String name;

    public User(int personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }
}


