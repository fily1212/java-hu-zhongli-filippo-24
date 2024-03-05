package lezione6;

public class MainBottiglia {
    public static void main(String[] args) {
        BottigliaConTappo b = new BottigliaConTappo(400);
        System.out.println(b);
        b.chiudi();
        System.out.println(b);
        b.riempi(100);
        System.out.println(b);
    }
}
