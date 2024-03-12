package lezione7.liste;

public class Node extends List{
    private int value;
    private List next;

    public Node(int value, List next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public void add() {

    }

    @Override
    public int get() {
        return 0;
    }

    @Override
    public int length() {
        return next.length() + 1;
    }
}
