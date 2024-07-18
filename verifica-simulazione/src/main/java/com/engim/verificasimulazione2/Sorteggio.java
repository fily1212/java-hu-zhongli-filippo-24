package com.engim.verificasimulazione2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteggio {
    private List<Persona> persone = new ArrayList<>();
    private boolean daMischiare = true;
    private int nextName = 0;
    public void aggiungi(Persona nome){
        persone.add(nome);
        daMischiare = true;
        nextName = 0;
    }

    public Persona next(){
        if(daMischiare){
            Collections.shuffle(persone);
            daMischiare = false;
            nextName = 0;
        }
        if(nextName >= persone.size())
            throw new IndexOutOfBoundsException("Nomi finiti");
        return persone.get(nextName++);
    }

    public List<Persona> getPersone() {
        return persone;
    }

    public boolean isDaMischiare() {
        return daMischiare;
    }
}
