package lezione7.liste;

public class Main {
    public static void main(String[] args) {
        List a = new Nil();
        List b = new Node(1,new Node(2,new Nil()));
        System.out.println(b.length());
    }


}
