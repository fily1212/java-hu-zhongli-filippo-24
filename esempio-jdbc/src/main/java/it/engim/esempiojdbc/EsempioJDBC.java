package it.engim.esempiojdbc;
import java.sql.*;

public class EsempioJDBC {
    static final String DB_URL = "jdbc:mysql://localhost/java";
    static final String USER = "java";
    static final String PASS = "java";
    static final String QUERY = "SELECT id, autore, titolo, anno FROM libro";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", autore: " + rs.getString("autore"));
                System.out.print(", titolo: " + rs.getString("titolo"));
                System.out.println(", anno: " + rs.getInt("anno"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
