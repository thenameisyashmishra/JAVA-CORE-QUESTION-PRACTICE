// Q75: Implement a Doubly Linked List.

public class Q75 {
    static class Node {
        int value;
        Node next;
        Node prev;
        Node(int value) { this.value = value; }
    }

    Node head;

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = node;
        node.prev = current;
    }

    public void delete(int value) {
        Node current = head;
        while (current != null && current.value != value) {
            current = current.next;
        }
        if (current == null) return;
        if (current.prev != null) current.prev.next = current.next;
        else head = current.next;
        if (current.next != null) current.next.prev = current.prev;
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q75 list = new Q75();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.displayForward();
        list.delete(20);
        list.displayForward();
    }
}
