package lezione5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcolatricePolacca {
    public static void main(String[] args) {
        System.out.println("Inserisci l'espressione in notazione polacca inversa: ");
        Scanner tastiera = new Scanner(System.in);
        boolean continua = true;
        List<Integer> stack = new ArrayList<>();
        while(continua){
            String token = tastiera.next();

            switch (token){
                case "+":

                    break;
                case "-":

                    break;
                case "*":

                    break;
                case "/":

                    break;
                case "=":
                    System.out.println(stack.get(stack.size()-1));
                    continua = false;
                    break;
                default:
                    int n = Integer.parseInt(token);
                    stack.add(n);
            }
        }
    }
}
