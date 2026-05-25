package day7;

public class Exception1 {
    public static void main(String[] args) {
        try{
        String s=null;
        String s1="nagi";
     
            if(s1.equals(s)){
                System.out.println("equal");
            }
            System.out.println(9/0);

        }catch(NullPointerException e){
            System.out.println("Null");
        }catch(ArithmeticException e){
            System.out.println(e);
        } 
    }
    
}
