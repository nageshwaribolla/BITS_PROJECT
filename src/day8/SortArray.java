package day8;

    
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
        int ArraySize=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<ArraySize;i++){
            int val=sc.nextInt(); 
            arr.add(val);

        }
        Collections.sort(arr);
       System.out.println(arr);

    }
 sc.close();
}
}
