// Q73: Implement a Linked List (Insert, Delete, Display).

public class Q73 {
    static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    Node head;

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = node;
        }
    }

    public void delete(int value) {
        if (head == null) return;
        if (head.value == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q73 list = new Q73();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.delete(20);
        list.display();
    }
}
