package day7;

import java.util.*;

public class SwapArrayK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  

        while (t-- > 0) {

            int n = sc.nextInt(); 
            int k = sc.nextInt(); 

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < k; i++) {
                int temp = arr[i];
                arr[i] = arr[n - k + i];
                arr[n - k + i] = temp;
            }

            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}