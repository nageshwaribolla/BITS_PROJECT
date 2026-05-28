package day10;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.println(j);
            }
        }
        sc.close();
    }
    
}
