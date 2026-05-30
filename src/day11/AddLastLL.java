package day11;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddLastLL {
    Node head;

    // Add at front
    public void addF(int data) {
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
    }

    // Add at last
    public void addL(int data) {
        Node nn = new Node(data);

        if (head == null) {  
            head = nn;
            return;
        }

        Node temp = head;
        while (temp.next != null) {   
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        AddLastLL ob = new AddLastLL();
        ob.addF(90);
        ob.addF(910);
        ob.addF(50);

        ob.addL(89); 
        

        ob.print(); 
    }
}