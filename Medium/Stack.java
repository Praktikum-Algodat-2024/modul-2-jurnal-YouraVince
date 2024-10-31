package Medium;

public class Stack {
    private SingleLinkedList list;

    public Stack() {
        list = new SingleLinkedList();
    }

    public void push(Pasien pasien) {
        list.add(pasien);
    }

    public Pasien pop() {
        if (list.size() == 0) return null;
        Pasien data = (Pasien) list.getFirst(); 
        list.removeFirst(); 
        return data;
    }

    public void display() {
        list.display();
    }
}
