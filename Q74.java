// Q74: Reverse a Linked List.

public class Q74 {
    static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        Node reversed = reverse(head);
        Node current = reversed;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
