package day11;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CountLinkedList {
    Node head;
    public void addF(int data) {
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
    }
    public int count() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
    
    public static void main(String[] args) {
      CountLinkedList ob = new CountLinkedList();
        ob.addF(90);
        ob.addF(910);
        ob.addF(50);
        System.out.println("Count = " + ob.count());
    }
}