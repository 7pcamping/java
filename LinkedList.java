class Ll {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;

    }

    //print
    public void PrintList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;


        }
        System.out.println("Null");
    }


    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;

        }


        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }
        secondLast.next = null;


    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;

        }
        Node prevNode = head;
        Node currNode = head.next;
        Node nextNode = null;
        while (currNode != null) {
             Node nextnode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextnode;


        }


        head.next = null;
        head = prevNode;

    }


    public static void main(String[] args) {
        Ll List = new Ll();
        List.addLast(10);
        List.addLast(20);
        List.addLast(30);
        List.addLast(40);
        List.addLast(50);
        List.PrintList();
        List.reverseIterate();
        List.PrintList();


    }


}
OUTPUT:
10->20->30->40->50->Null
50->40->30->20->10->Null
