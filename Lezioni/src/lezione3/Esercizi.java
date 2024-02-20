package lezione3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Esercizi {
    /*
    Es1: (if-else-Scanner) Chiedere un numero e stampare "Pari" o "dispari"
    Es2: (for) Chiedere quante temperature si vuole inserire
    stampare il minimo, massimo e la media (senza array).
    Es3: (for - ArrayList) salvare le temperature precedenti
    stampare quelle maggiori di 10 gradi
    Es4: (while) chiedere all'utente dei numeri e sommarli finché
    non scrive 0 (terminare quando inserisce 0)
    Es5: (String, substring) stampare il proprio nome al contrario
    * */
    public static void main(String[] args) {
        //es1
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n = Integer.parseInt(tastiera.nextLine());
        // modo 1
        if (n % 2 == 0)
            System.out.println("Pari");
        else
            System.out.println("Dispari");
        // modo 2
        System.out.println(n%2==0?"Pari":"Dispari");

        //es2

        System.out.print("Quante temperature vuoi inserire? ");
        n = Integer.parseInt(tastiera.nextLine());
        int minimo = Integer.MAX_VALUE;
        int massimo = Integer.MIN_VALUE;
        int somma = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Inserisci il "+(i+1)+"° numero: ");
            int inserito = Integer.parseInt(tastiera.nextLine());
            somma += inserito;
            if (inserito < minimo)
                minimo = inserito;
            if (inserito > massimo)
                massimo = inserito;
        }
        System.out.println("La media è: " + (somma/n)
                + "\nIl minimo: "+(minimo)+"\nIl massimo:"+(massimo));

        // es3
        System.out.print("Quante temperature vuoi inserire? ");
        n = Integer.parseInt(tastiera.nextLine());
        // creo una lista
        List<Integer> temp = new ArrayList<>();
        //faccio l'inserimento in lista
        for(int i = 0; i < n; i++){
            System.out.print("Inserisci il "+(i+1)+"° numero: ");
            int inserito = Integer.parseInt(tastiera.nextLine());
            // metodo per inserire in lista
            temp.add(inserito);
        }

        System.out.println("Temperature maggiori di 10: ");
        // ciclo sulla lista
        for(int i = 0; i < temp.size(); i++){
            // se la temperatura su cui sto ciclando è maggiore di 10
            if(temp.get(i)>10)
                // la stampo
                System.out.print(temp.get(i) + " ");
        }
        // for each
        // for (TIPO nome_variabile : nome_lista)
        for(int num: temp){
            if(num > 10)
                System.out.println(num);
        }


        //es4
        int sommaEs4 = 0;
        System.out.println("Inserisci un numero da sommare o 0 per terminare");
        int inseritoEs4 = Integer.parseInt(tastiera.nextLine());
        while(inseritoEs4 != 0){
            sommaEs4 += inseritoEs4;
            System.out.println("Inserisci un nuovo numero da sommare o 0 per terminare");
            inseritoEs4 = Integer.parseInt(tastiera.nextLine());
        }
        System.out.println("La somma è " + sommaEs4);

        // es5
        String nome = "Filippo";
        for (int i = 0; i < nome.length(); i++)
            System.out.print(nome.substring(nome.length()-i-1,nome.length()-i));

    }
}
