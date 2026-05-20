package day2;

import java.util.Scanner;

public class PrintSumofNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            
        }
        System.out.println("sum="+sum);
        sc.close();
    }
}

