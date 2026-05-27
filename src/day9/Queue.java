package day9;

public class Queue {
    int front=-1;
    int rear=-1;
    int arr[]=new int[5];
    void enqueue(int data){
        if(rear==arr.length-1){
            System.out.println("Queue overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        arr[rear]=data;
        System.out.println(arr[rear]+"->inserted");
    }
    void dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Dequeue is empty");
            return;
        }
        System.out.println(arr[front]+"->deleted");
        front++;
    }
    void peak(){
         if(front==-1 || front>rear){
            System.out.println("Dequeue is empty");
            return;
        }
        System.out.println(arr[front]+"->is peak value");
      
    }
    void display(){
        if(front==-1 || front>rear){
            System.out.println("Dequeue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            if(arr[i]==arr[rear])
            System.out.println(arr[i]);
            else
                System.out.println(arr[i]+"->");
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(70);
        q.enqueue(789);
        q.enqueue(178);
        q.dequeue();
        //q.peak();
        q.display();
    }
}
