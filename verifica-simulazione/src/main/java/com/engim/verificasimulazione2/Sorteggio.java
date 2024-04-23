package com.engim.verificasimulazione2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteggio {
    private List<Persona> nomi = new ArrayList<>();
    private boolean daMischiare = true;
    private int nextName = 0;
    public void aggiungi(Persona nome){
        nomi.add(nome);
        daMischiare = true;
        nextName = 0;
    }

    public Persona next(){
        if(daMischiare){
            Collections.shuffle(nomi);
            daMischiare = false;
            nextName = 0;
        }
        if(nextName >= nomi.size())
            throw new IndexOutOfBoundsException("Nomi finiti");
        return nomi.get(nextName++);
    }

    public List<Persona> getNomi() {
        return nomi;
    }

    public boolean isDaMischiare() {
        return daMischiare;
    }
}
