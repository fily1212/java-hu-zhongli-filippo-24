package lezione6;

public class Ricorsivo {

    public static int fattoriale(int x){
        // se x == 0 il fattoriale è 1
        // altrimenti è  x * (x-1)!
        if(x == 0){
            return 1;
        }else{
            return x * fattoriale(x-1);
        }
        // fib(0) = 0 , fib(1) = 1, fib (x) = fib(x-1) + fib(x-2)
    }
    public static int fibonacci(int x){
        if (x == 0) return 0;
        else if(x == 1) return 1;
        else return fibonacci(x-1) + fibonacci(x-2);
    }

//    Rovescia una stringa: Crea un metodo statico ricorsivo che inverte una stringa. Il metodo dovrebbe prendere come parametro la stringa da invertire e restituire la stringa invertita. Per esempio, se il metodo riceve "java", dovrebbe restituire "avaj".
    public static String reverse(String x){
        if (x.length() < 2)
            return x;
        else {
            String primaLettera = x.substring(0, 1);
            return reverse(x.substring(1)) + primaLettera;
        }
    }

    // count down ricorsivo
    public static void countdown(int x){
        if(x > 0){
            System.out.println(x);
            countdown(x-1);
        }
        else
            System.out.println("Boom!");
    }


    public static void main(String[] args) {
        countdown(2);
    }
}
