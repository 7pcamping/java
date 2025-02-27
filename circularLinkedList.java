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
OUTPUT:
"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\lib\idea_rt.jar=65306:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\ASUS\IdeaProjects\DSA\out\production\DSA CircularQueue
[ 10 20 30 40 0 0 ]  Front: 0, Rear: 3

[ 0 0 30 40 0 0 ]  Front: 2, Rear: 3

[ 0 0 30 40 50 60 ]  Front: 2, Rear: 5

[ 70 0 30 40 50 60 ]  Front: 2, Rear: 0
[ 70 80 30 40 50 60 ]  Front: 2, Rear: 1
Queue is full.

Process finished with exit code 0
