package it.engim.esempioesame.repository;

import it.engim.esempioesame.model.Fermata;
import it.engim.esempioesame.model.Preventivo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static it.engim.esempioesame.constants.DBConfig.*;

public class PreventivoRepository {

    public static List<Preventivo> getPreventivo(){
        List<Preventivo> preventivi = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select id, nome, zona from fermate");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){

                Preventivo p = new Preventivo(rs.getInt("id"),
                        rs.getString("azienda"),
                        rs.getString("piano"),
                        rs.getInt("max_fermate"),
                        rs.getInt("max_extraurbane"),
                        rs.getInt("max_zone"),
                        rs.getInt("prezzo"));
                // aggiungo alla lista
                preventivi.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return preventivi;
    }




}
