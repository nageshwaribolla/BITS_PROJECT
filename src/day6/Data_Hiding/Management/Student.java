package day6.Data_Hiding.Management;

public class Student {
   public String name="student1";
    private String subject="java";
     protected double amount=5000;
    String deparment ="CSE";
    public void displayDetails(){
        String name="Nagi";
        System.out.println("Name:"+name);
         System.out.println("Subject: "+subject);
          System.out.println("Amount: "+amount);
           System.out.println(" deparment: "+ deparment);
    }
    
}
