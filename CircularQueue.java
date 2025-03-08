public class CircularQueue {
    int max_size = 6;
    int[] queue = new int[max_size];
    int front = -1;
    int rear = -1;

    void enqueue(int data) {        if (((rear + 1) % max_size) == front) {
            System.out.println("Queue is full.");
            return;
        }
        if (front == -1 && rear == -1) {
            front++;
        }
        rear = (rear + 1) % max_size;
        queue[rear] = data;
    }

    void dequeue() {
        if (front == -1 && rear == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        queue[front] = 0;
        front = (front + 1) % max_size;
    }

    void display() {
        System.out.print("[ ");
        for (int i = 0; i < max_size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.print("] ");
        System.out.println(" Front: " + front + ", Rear: " + rear);
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        cq.display();

        System.out.println();
        cq.dequeue();
        cq.dequeue();
        cq.display();

        System.out.println();

        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();

        System.out.println();
        cq.enqueue(70);
        cq.display();
        cq.enqueue(80);
        cq.display();
        cq.enqueue(90);
    }
}
