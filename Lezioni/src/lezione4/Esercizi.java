package lezione4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Esercizi {
    public static void main(String[] args) {
        //Esercizio 4 (Liste): creare una lista di 10 nomi con ArrayList.
        // Rimuovere quelli con la prima lettera una vocale.
        String[] n = {"Anna", "Enrico","Bob", "Carlo"};
        List<String> nomi = Arrays.asList(n);
        System.out.println(nomi.stream().filter(nome->
                !( nome.substring(0,1).equalsIgnoreCase("a")||
                nome.substring(0,1).equalsIgnoreCase("e")||
                nome.substring(0,1).equalsIgnoreCase("i")||
                nome.substring(0,1).equalsIgnoreCase("o")||
                nome.substring(0,1).equalsIgnoreCase("u"))).collect(Collectors.toList()));
    }
}
