import java.util.Scanner;
public class EsercizioInput {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un nome: ");
        String nome = tastiera.nextLine();
        System.out.print(nome.length());
        System.out.println("Ciao " + nome);
        String numero = "1";
        int a = Integer.parseInt(numero);
        int eta = Integer.parseInt(tastiera.nextLine());
        int b = 0;
        System.out.println(b);
        double n1 = (double)a;
        char c = 'A';
        int n2 = (int)c;
        System.out.println(n2);
        
    }

}
