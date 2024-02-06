package lezione2.riscaldamento;


import java.util.Scanner;

/*Scrivere un programma che chiede
in input due numeri e stampa la somma*/
public class Es1 {
    // main
    public static void main(String[] args) {
        // alt + invio per importare velocemente
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n1 = Integer.parseInt(tastiera.nextLine());
        // sout
        System.out.println("Inserisci un numero: ");
        // CTRL + D per duplicare una riga
        int n2 = Integer.parseInt(tastiera.nextLine());
        System.out.println("La somma è " + (n1+n2));
    }

}
