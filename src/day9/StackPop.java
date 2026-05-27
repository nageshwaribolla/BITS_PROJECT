 package day9;

public class StackPop {
     int arr[]=new int[5];
        int top=-1;
        void push(int data){
            if(top==arr.length-1){
                System.out.println("Stack Overflow");
                return;
            }
            ++top;
            arr[top]=data;
            System.out.println(arr[top]+"->inserted");
        }
       void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top]+"->deleted");
        top--;
        arr[top]=0;
       }
        
    public static void main(String[] args) {
       StackPop ob=new StackPop();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
         ob.push(908);
        ob.push(400);
       ob.pop();
       ob.pop();
    }
    
}
