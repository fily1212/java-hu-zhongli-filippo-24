package lezione5;

public class Bottiglia {
    int capacita;
    int quantita;

    public Bottiglia(int capacita) {
        this.capacita = capacita;
        this.quantita = 0;
    }

    public Bottiglia(int capacita, int quantita) {
        this.capacita = capacita;
        this.quantita = quantita;
    }

    public void riempi(int quantita){
        this.quantita += quantita;
    }

    public void svuota(int quantita){
        this.quantita -= quantita;
    }

    @Override
    public String toString() {
        return "B - " +
                "c: " + capacita +
                " q: " + quantita;
    }
}
