package lezione2;

import java.util.Scanner;

public class EsempioEquals {
    public static void main(String[] args) {
        String nome = "Filippo";
        // Modo sbagliato per confrontare gli oggetti
        System.out.println(nome == "AFilippo".substring(1));
        // modo corretto:
        System.out.println(nome.equals("AFilippo".substring(1)));
        System.out.println(nome.equalsIgnoreCase("ffilippo".substring(1)));

        Scanner tastiera = new Scanner(System.in);
        String nomeUtente = tastiera.nextLine();
        String password = tastiera.nextLine();
        boolean condizione = nomeUtente.equals("utente") &&
                password.equals("password");
        System.out.println(condizione);
        if(condizione){
            System.out.println("Messaggio segreto");
        }else if(condizione){
            System.out.println("User e/o password errati");
        }else{
            System.out.println("Ciao");
        }

    }
}
