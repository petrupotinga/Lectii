package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectJDBC {
    public static void main(String[] args) {
        try {
            // Încărcați driverul PostgreSQL JDBC
            Class.forName("org.postgresql.Driver");

            // Definiți detaliile de conexiune la baza de date
            String url = "jdbc:postgresql://localhost:5432/NewDB";
            String username = "postgres";
            String password = "2015";

            // Stabiliți conexiunea
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                // Definiți instrucțiunea SQL
                String selectQuery = "SELECT personid, name FROM person";

                // Creați obiectul PreparedStatement
                try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                    // Executați instrucțiunea de SELECT și obțineți rezultatul în ResultSet
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        // Parcurgeți rezultatul și creați obiectele Person
                        List<Person> persons = new ArrayList<>();
                        while (resultSet.next()) {
                            int personId = resultSet.getInt("personid");
                            String name = resultSet.getString("name");

                            Person person = new Person(personId, name);
                            persons.add(person);
                        }

                        // Utilizați lista de obiecte Person după necesitate
                        for (Person person : persons) {
                            System.out.println(person.getPersonId() + " - " + person.getName());
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
class Person {
    private int personId;
    private String name;

    public Person(int personId, String name) {
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
