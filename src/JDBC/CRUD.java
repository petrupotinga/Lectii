package JDBC;

import java.sql.*;

public class CRUD {
    // Detalii de conexiune la baza de date
    private static final String URL = "jdbc:postgresql://localhost:5432/nume_baza_de_date";
    private static final String UTILIZATOR = "utilizator";
    private static final String PAROLA = "parola";

    // Metodă pentru crearea unui nou înregistrare în tabel
    public static void create(String nume, String prenume, int varsta) {
        try (Connection connection = DriverManager.getConnection(URL, UTILIZATOR, PAROLA)) {
            String query = "INSERT INTO tabel (nume, prenume, varsta) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nume);
            statement.setString(2, prenume);
            statement.setInt(3, varsta);
            statement.executeUpdate();
            System.out.println("Înregistrare creată cu succes.");
        } catch (SQLException e) {
            System.out.println("Eroare la crearea înregistrării: " + e.getMessage());
        }
    }

    // Metodă pentru citirea unei înregistrări din tabel
    public static void read(int id) {
        try (Connection connection = DriverManager.getConnection(URL, UTILIZATOR, PAROLA)) {
            String query = "SELECT * FROM tabel WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nume = resultSet.getString("nume");
                String prenume = resultSet.getString("prenume");
                int varsta = resultSet.getInt("varsta");

                System.out.println("ID: " + id);
                System.out.println("Nume: " + nume);
                System.out.println("Prenume: " + prenume);
                System.out.println("Varsta: " + varsta);
            } else {
                System.out.println("Nu s-a găsit nicio înregistrare cu ID-ul specificat.");
            }
        } catch (SQLException e) {
            System.out.println("Eroare la citirea înregistrării: " + e.getMessage());
        }
    }

    // Metodă pentru actualizarea unei înregistrări în tabel
    public static void update(int id, String nume, String prenume, int varsta) {
        try (Connection connection = DriverManager.getConnection(URL, UTILIZATOR, PAROLA)) {
            String query = "UPDATE tabel SET nume = ?, prenume = ?, varsta = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nume);
            statement.setString(2, prenume);
            statement.setInt(3, varsta);
            statement.setInt(4, id);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Înregistrare actualizată cu succes.");
            } else {
                System.out.println("Nu s-a găsit nicio înregistrare cu ID-ul specificat.");
            }
        } catch (SQLException e) {
            System.out.println("Eroare la actualizarea înregistrării: " + e.getMessage());
        }
    }

    // Metodă pentru ștergerea unei înregistrări din tabel
    public static void delete(int id) {
        try (Connection connection = DriverManager.getConnection(URL, UTILIZATOR, PAROLA)) {
            String query = "DELETE FROM tabel WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Înregistrare ștearsă cu succes.");
            } else {
                System.out.println("Nu s-a găsit nicio înregistrare cu ID-ul specificat.");
            }
        } catch (SQLException e) {
            System.out.println("Eroare la ștergerea înregistrării: " + e.getMessage());
        }
    }
}
