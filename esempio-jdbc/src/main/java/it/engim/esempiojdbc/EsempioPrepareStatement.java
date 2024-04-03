package it.engim.esempiojdbc;
import java.sql.*;

public class EsempioPrepareStatement {
    static final String DB_URL = "jdbc:mysql://localhost/java";
    static final String USER = "java";
    static final String PASS = "java";
    public static void main(String[] args) {
        // Open a connection
        PreparedStatement pstmt = null;
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String SQL = "SELECT id, autore, titolo, anno FROM libro where autore = ? and anno > ?";
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,"Dante Alighieri");
            pstmt.setInt(2, 1000);
            ResultSet rs = pstmt.executeQuery();
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
