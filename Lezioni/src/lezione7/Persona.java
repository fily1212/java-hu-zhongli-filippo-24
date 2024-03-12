package lezione7;

public class Persona {
    private String nome;
    private String cognome;
    private int altezza;
    private String coloreOcchi;
    private Sesso sesso;

    public enum Sesso{
        UOMO, DONNA, NON_BINARIO
    }

    public Persona(String nome, String cognome, int altezza, String coloreOcchi, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.altezza = altezza;
        this.coloreOcchi = coloreOcchi;
        this.sesso = sesso;
    }

    public static void main(String[] args) {
        new Persona("Carlo", "Cracco", 175,"limone", Sesso.DONNA);
    }
}
