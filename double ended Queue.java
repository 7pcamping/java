import java.sql.SQLOutput;
import java.util.Scanner;

public class DEqueue {
    int front = -1;
    int rear = -1;
    int size = 200;
    int[] queue = new int[size];

    void enqueue(int data, int choice) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;

        }
        if (choice == 1) {     //input from rear
            if (rear == -1 && front == -1) {
                front++;
            }
            rear++;
            queue[rear] = data;

        } else {
            if (rear == -1 && front == -1) {
                rear++;
                front++;
            } else {
                front--;
            }
            queue[front] = data;
        }

    }

    void dequeue(int choice) {
        if (front == -1 && rear == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;

        }
        if (choice == 1) { //dequeue from Rear
            front++;
        } else {         //dequeue from rear
            rear--;
        }
    }

    void display() {
        System.out.print("[");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.print("]");
        System.out.println("Front at:" + front + ",Rear at:" + rear);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        DEqueue queue = new DEqueue();
        do {
            System.out.println("Main Mainu:");
            System.out.println("Enter 1 to enqueue from rear");
            System.out.println("Enter 2 to dequeue from rear");
            System.out.println("Enter 3 to enqueue from front");
            System.out.println("Enter 4 to dequeue from front");
            System.out.println();

            System.out.println("Enter 0 to exit:");
            System.out.print("Enter Your choice: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    queue.enqueue(data, 1);
                    queue.display();
                    break;
                case 2:
                    queue.dequeue(1);
                    queue.display();
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    queue.enqueue(data, 3);
                    queue.display();
                    break;
                case 4:
                    queue.dequeue(2);
                    queue.display();
                    break;


            }

        }
        while (input != 0);
        System.out.println("Exit Successfully.");
    }
}
