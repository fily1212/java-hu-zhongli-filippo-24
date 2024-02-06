package lezione2;

import java.util.Scanner;

public class Booleani {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(b);
        System.out.println(!b);
        System.out.println("AND");
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && a);
        System.out.println(b && b);
        System.out.println("OR");
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || a);
        System.out.println(b || b);

        // == != < > <= >=

        Scanner tastiera = new Scanner(System.in);
        int eta = Integer.parseInt(tastiera.nextLine());
        boolean condizione = eta >= 18;
        System.out.println(condizione);

        // chiedere all'utente un numero
        // stampare true se un voto insufficiente (cioè
        // tra 0 e 5

        // chiedere un numero, true se è pari

        // dato un anno, stampare true se è bisestile
        // un anno è bisestile se
        // - è divisibile per 4 ma non per 100
        // - oppure è divisibile per 400
        // 2024: SI
        // 1900: NO
        // 2023: NO
        // 2000: SI

    }
}
