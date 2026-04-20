// Q77: Implement a Queue using Arrays.

public class Q77 {
    static class Queue {
        int[] data = new int[100];
        int front = 0;
        int rear = 0;

        void enqueue(int value) {
            if (rear < data.length) data[rear++] = value;
        }

        int dequeue() {
            return front < rear ? data[front++] : Integer.MIN_VALUE;
        }

        boolean isEmpty() {
            return front == rear;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
