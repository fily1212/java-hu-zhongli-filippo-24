package lezione7.liste;

public class Node extends List{
    private int value;
    private List next;

    public Node(int value, List next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public void add(int n) {
        if(next instanceof Nil){
            next = new Node(n,next);
        }else
            next.add(n);

    }

    @Override
    public int get(int n) {
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
