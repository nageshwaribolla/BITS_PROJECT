package day7;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
        
            if((t&(n-1))==0){
            
                System.out.println("power of 4");
            }else{
                System.out.println("not power of 4");
            }
        }
        sc.close();
    }
    
}
