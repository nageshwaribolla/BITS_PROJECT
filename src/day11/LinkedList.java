package day11;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    public void addF(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    
    public void p1() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ob = new LinkedList();
        ob.addF(90);
        ob.addF(910);
        ob.addF(50);

        ob.p1();  
    }
}