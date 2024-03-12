package lezione7.forme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Poligono> poligoni = new ArrayList<>();

        poligoni.add(new Quadrato(10));
        poligoni.add(new Rettangolo(10,20));
  //      poligoni.add(new Poligono());

        for(Poligono p : poligoni){
            System.out.println(p.area());
        }

        System.out.println(poligoni);
    }
}
