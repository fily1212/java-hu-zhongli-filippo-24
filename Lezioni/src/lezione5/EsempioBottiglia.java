package lezione5;

public class EsempioBottiglia {
    public static void main(String[] args) {
        Bottiglia b1 = new Bottiglia(1500);
        b1.quantita = 1;
        System.out.println(b1.quantita);
        System.out.println(b1.capacita);
        System.out.println(b1);
        b1.riempi(5);
        System.out.println(b1);
    }
}
