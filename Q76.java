// Q76: Implement a Stack using Arrays.

public class Q76 {
    static class Stack {
        int[] data = new int[100];
        int top = -1;

        void push(int value) {
            if (top < data.length - 1) data[++top] = value;
        }

        int pop() {
            return top >= 0 ? data[top--] : Integer.MIN_VALUE;
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
