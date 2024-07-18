package com.engim.verificasimulazione2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private static Sorteggio sorteggio = new Sorteggio();

    // sorteggio di persone
    //

    /*
     * ES 1: get ("/add?nome=n&sesso=s") che aggiunge una persona con nome n e sesso s per il sorteggio (utilizzare
     * la classe Sorteggio) 15 p
     *
     * ES 2: get ("/lista?sesso=s") che restituisce la lista di tutte le persone di un certo sesso 20 p
     *
     * ES 3: get ("/sorteggia") che restituisce 2
     * nomi casuali uno maschile e uno femminile (utilizzare la classe Sorteggio) 20 p
     *
     * ES 4: creare la classe Coppia che contengono una Persona Uomo e una Persona Donna
     *  se il numero di uomini e donne è uguale, creare una lista di coppie che hanno un uomo e una donna
     * senza avere doppioni (30p)
     * */

    @GetMapping(value="/sorteggia")
    public List<Persona> coppia(){
        Persona p1 = sorteggio.next();
        Persona p2 = sorteggio.next();
        while(p1.getSesso()==p2.getSesso())
            p2 = sorteggio.next();
        List<Persona> persone = new ArrayList<>();
        persone.add(p1);
        persone.add(p2);
        return persone;
    }
}
