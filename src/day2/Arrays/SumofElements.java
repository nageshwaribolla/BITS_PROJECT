package day2.Arrays;

import java.util.Scanner;

public class SumofElements {
    public static int[] selection() {
        return new int[]{1,2,3};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("insert the element at position:"+i);
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println("Sum of array elements:"+sum);
        sc.close();
    }
    
}
