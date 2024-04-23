package com.engim.verificasimulazione2;

public class Persona {
    private String nome;
    private Sesso sesso;
    public enum Sesso{
        UOMO, DONNA
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }
}
