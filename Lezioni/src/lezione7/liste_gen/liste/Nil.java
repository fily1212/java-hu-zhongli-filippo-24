package lezione7.liste_gen.liste;

public class Nil<T> extends List<T> {
    @Override
    public void add(T n) {

    }

    @Override
    public T get(int n) {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }
}
