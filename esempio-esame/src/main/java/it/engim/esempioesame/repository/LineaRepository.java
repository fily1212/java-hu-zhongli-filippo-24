package it.engim.esempioesame.repository;

import it.engim.esempioesame.model.Fermata;
import it.engim.esempioesame.model.Linea;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static it.engim.esempioesame.constants.DBConfig.*;

public class LineaRepository {

    public static List<Linea> getLinee(){
        List<Fermata> fermate = FermataRepository.getFermate();
        List<Linea> linee = new ArrayList<>();
        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select id, nome from linee");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                // creo una fermata con i dati del DB
                Linea linea = new Linea(rs.getInt("id"),rs.getString("nome"));
                // aggiungo alla lista
                linee.add(linea);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmt = conn.prepareStatement("select id,linea,fermata from fermate_linee");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                aggiungiFermata(rs.getInt("linea"),rs.getInt("fermata"), fermate, linee);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return linee;
    }

    private static void aggiungiFermata(int lineaId, int fermataId, List<Fermata> fermate, List<Linea> linee) {
        Fermata fermata = null;
        for (Fermata f : fermate){
            if(f.getId() == fermataId)
                fermata = f;
        }

        Linea linea = linee.stream().filter(l->l.getId() == lineaId).toList().getFirst();
        linea.getFermate().add(fermata);
    }


}
