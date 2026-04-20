// Q78: Implement a Stack using Pointers (Linked List).

public class Q78 {
    static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    Node top;

    void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    int pop() {
        if (top == null) return Integer.MIN_VALUE;
        int value = top.value;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Q78 stack = new Q78();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
