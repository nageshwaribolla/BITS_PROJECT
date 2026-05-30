package day11;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteEnd {
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
    public void delF(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void delE(){
        if(head==null){
            return;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }

    public static void main(String[] args) {
      DeleteEnd ob = new DeleteEnd();
        ob.addL(90);
        ob.addL(910);
        ob.addL(50);

        ob.addL(89); 
        ob.delE(); 

        ob.print(); 
    }
}