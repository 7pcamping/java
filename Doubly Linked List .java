class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;

    }
}


public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {//to declare the list is empty;
        tail = head = null;
    }

    public void addFirst(int data) {//AddFirst
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {//AddLast
        Node newNode = new Node(data);
        if (tail == null) {
            tail = head = null;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteFirst() {//DeleteFirst
        if (head == null) {
            System.out.println("The list is empty.Cannot delete");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

    }

    public void deleteLast() {//DeleteLast
        if (tail == null) {
            System.out.println("The list is empty.Cannot delete");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);
        list.deleteFirst();
        list.deleteLast();
        System.out.println("List from head to tail");
        list.printList();
    }

}


