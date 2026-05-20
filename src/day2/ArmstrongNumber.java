package day2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean solution(int num){
        //step1:get count of digits
        int temp=num;
        int count=0;
        while(temp != 0){
            count++;
            temp=temp/10;
        }
            //step2:calculate the consitutive sum of all
            temp=num;
            double result=0;
            while (temp != 0) 
                {
                    int digit=temp%10;
                    result=result+Math.pow(digit, count);
                    temp/=10;
                
            }
            //step3:check for equalent of resultant number
            System.out.println(result+" "+num);
            return result==num;

        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean res=solution(num);
        if(res){
            System.out.println("This is a Armstrong number");
        }else{
           System.out.println("This is  not a Armstrong number"); 
        }  
        sc.close();      
    }
    
}
