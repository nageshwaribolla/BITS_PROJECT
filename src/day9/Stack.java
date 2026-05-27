package day9;

public class Stack {

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
        void peak(){
            if(top==-1){
                System.out.println("No values in stack");
                return;
            }
            System.out.println(arr[top]+"->is peak element");
        }
      boolean search(int data){
          if(top==-1){
            
            return false;
          }
          for(int i=0;i<=top;i++){
            if(arr[i]==data){
                return true;
            }
          }
          return false;
       }
        
       void display(){
        if(top==-1){
            System.out.println("No elements in stack");
            return;
        }
        for(int i=top;i>=0;i--){
            if(i==0)
                System.out.println(arr[i]);
               else
                System.out.println(arr[i]+"->");
            }
        }
        void count(){
        if(top==-1){
            System.out.println("No elements in stack");
            return;
        }
        int c=0;
        for(int i=top;i>=0;i--){
           c++;
            }
            System.out.println(c);
        }
       
    public static void main(String[] args) {
       Stack ob=new Stack();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
         ob.push(908);
        
      // System.out.println(ob.search(908));
      ob.count();
    }
    
}




