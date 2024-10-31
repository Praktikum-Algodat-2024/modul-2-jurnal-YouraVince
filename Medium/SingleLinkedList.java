package Medium;

public class SingleLinkedList {
    private Node head;

    public SingleLinkedList() {
        head = null;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? "\n" : ""));
            current = current.next;
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next; 
        }
    }

    public Object getFirst() {
        return head != null ? head.data : null; 
    }
}
