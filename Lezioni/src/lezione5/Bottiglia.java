package lezione5;

public class Bottiglia {
    private int capacita;
    private int quantita;

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
        if(this.quantita>capacita)
            this.quantita = capacita;
        //this.quantita = Math.min(this.capacita, this.quantita + quantita);
    }

    public void svuota(int quantita){
        this.quantita -= quantita;
        if(this.quantita<0)
            this.quantita = 0;

        //this.quantita = Math.max(0,this.quantita - quantita);
    }

    @Override
    public String toString() {
        return "B - " +
                "c: " + capacita +
                " q: " + quantita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bottiglia bottiglia = (Bottiglia) o;

        return (capacita == bottiglia.capacita) &&
                quantita == bottiglia.quantita;
    }

    @Override
    public int hashCode() {
        int result = capacita;
        result = 31 * result + quantita;
        return result;
    }
}
