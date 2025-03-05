import java.sql.SQLOutput;
import java.util.Scanner;



public class ArrayQueue{
    int size=100;
    int [] queue=new int [size];

    int front=-1;
    int rear=-1;

    void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1&&rear==-1){
            front++;
        }
        rear++;
        queue[rear]=data;

    }
    void dequeue(){
        if((front==-1&&rear==-1)||front>rear){
            System.out.println("queue is empty");
            return;

        }
        front++;

    }
    void display(){

        System.out.print("[");
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("]");
        System.out.println("Front at :" +front+",Rear at:"+rear);
    }

    public static void main(String[] args) {
        ArrayQueue queue =new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        //queue.enqueue(50);
        //queue.enqueue(60);
        queue.display();
        System.out.println();


        while(queue.front <= queue.rear){
            queue.dequeue();
            queue.display();
        }
    }
}
