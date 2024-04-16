package it.engim.esempioesame.repository;

import it.engim.esempioesame.model.Fermata;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static it.engim.esempioesame.constants.DBConfig.*;

public class FermataRepository {

    public static List<Fermata> getFermate(){
        List<Fermata> fermate = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select id, nome, zona from fermate");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){

                // creo una fermata con i dati del DB
                Fermata fermata = new Fermata(rs.getInt("id"),rs.getString("nome"),rs.getString("zona"));
                // aggiungo alla lista
                fermate.add(fermata);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fermate;
    }




}
