package Medium;
public class Queue {
    private SingleLinkedList list;

    public Queue() {
        list = new SingleLinkedList();
    }

    public void enqueue(Pasien pasien) {
        list.add(pasien);
    }

    public Pasien dequeue() {
        if (list.size() == 0) return null;
        Pasien data = (Pasien) list.getFirst(); 
        list.removeFirst(); 
        return data;
    }

    public void display() {
        list.display();
    }
}
