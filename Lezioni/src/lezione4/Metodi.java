package lezione4;

public class Metodi {

    public static int triplo(int n){
        return n + doppio(n);
    }
     public static int doppio(int n){

        return n * 2;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = doppio(a);
    }
}
