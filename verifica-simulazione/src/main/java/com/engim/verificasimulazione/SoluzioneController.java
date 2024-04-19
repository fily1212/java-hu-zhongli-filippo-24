package com.engim.verificasimulazione;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private static Sorteggio sorteggio = new Sorteggio();

    // ES1
    @GetMapping(value="/add")
    public void aggiungiNome(@RequestParam(value="nome")String nome){
        sorteggio.aggiungi(nome);
    }

    @GetMapping("/sorteggia")
    public List<String> sorteggia(@RequestParam(value="num") int n){
        List<String> nomi = new ArrayList<>();
        for(int i = 0; i<n; i++){
            nomi.add(sorteggio.next());
        }
        return nomi;
    }

    @GetMapping("/listaNomi")
    public List<String> listaNomi(@RequestParam(value="sottostringa") String s){
        List<String> nomiConS = new ArrayList<>();
        List<String> nomi = sorteggio.getNomi();
        for(String nome : nomi){
            if(nome.contains(s))
                nomiConS.add(nome);
        }
        return nomiConS;
    }

    /*
    * ES 1: get ("/add?nome=n") che aggiunge un nome n per il sorteggio (utilizzare la classe Sorteggio) 15 p
    * ES 2: get ("/sorteggia?num=n") che restituisce n nomi casuali (utilizzare la classe Sorteggio) 20 p
    * ES 3: get ("/listaNomi?sottostringa=s") che restituisce la lista dei nomi che contengono la sottostringa s 20 p
    * ES 4: creare la classe SorteggioRuolo in cui, dopo aver aggiunto i nomi ("/add?nome=n"),
    * sorteggia per ogni nome un ruolo di Lupus (get: "/sorteggia")
    * se i giocatori sono meno di 7 non sorteggia. con 8 sorteggia 5 VILLICI, 2 LUPI, 1 VEGGENTE
    * 9: precedenti + 1 MEDIUM
    * 10: + 1 INDEMONIATO
    * 11: + 1 PROTETTORE
    * 12: + 1 VILLICO
    * 13: + 1 LUPO
    * 14: + 1 VILLICO
    * 15: + 1 INDEMONIATO
    * Non consente l'aggiunta di più di 15 giocatori.
    * creare get ("/getRuoli") che restituisce tutti i ruoli e get ("getRuolo?nome=n")
    * che restituisce il ruolo del singolo giocatore  30 p
    * */

}
