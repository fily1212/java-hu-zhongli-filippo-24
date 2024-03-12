package lezione7.liste_gen.liste;

public class Main {
    public static void main(String[] args) {
        List a = new Nil<Integer>();
        List b = new Node<Integer>(1,new Node<Integer>(2,new Nil<Integer>()));
        System.out.println(b.length());
    }


}
