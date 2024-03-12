package lezione7.liste_gen.liste;

public class Node<T> extends List<T> {
    private T value;
    private List<T> next;

    public Node(T value, List next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public void add(T n) {
        if(next instanceof Nil){
            next = new Node<T>(n,next);
        }else
            next.add(n);

    }

    @Override
    public T get(int n) {
        if(n==0)
            return value;
        else
            return next.get(n-1);
    }

    @Override
    public int length() {
        return next.length() + 1;
    }
}
