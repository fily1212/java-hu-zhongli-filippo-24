package it.engim.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String titolo;
    private Date dataScadenza;
    private Date dataInserimento;

    private Priorita priorita;
    private boolean completato;

    enum Priorita{
        ALTA, NORMALE, BASSA
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public Date getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(Date dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public Priorita getPriorita() {
        return priorita;
    }

    public void setPriorita(Priorita priorita) {
        this.priorita = priorita;
    }

    public boolean isCompletato() {
        return completato;
    }

    public void setCompletato(boolean completato) {
        this.completato = completato;
    }
}
