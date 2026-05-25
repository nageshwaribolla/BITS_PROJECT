package day7;


public class Throw1 {
    public static void main(String[] args) {
        
        int n=20;
        try{
            if(n>18){
                throw new ArithmeticException(" Eligible for work");
            }
            System.out.println("Not eligible for work");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
