package day7;

import java.util.*;

public class PowerofEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  

        while (t-- > 0) {
            long n = sc.nextLong();

            if (isPowerOfEight(n)) {
                System.out.println("power of 8");
            } else {
                System.out.println("not power of 8");
            }
        }

        sc.close();
    }

    public static boolean isPowerOfEight(long n) {
        if (n <= 0) return false;

        if ((n & (n - 1)) != 0) return false;

       
        int count = 0;
        while (n > 1) {
            n >>= 1; 
            count++;
        }

        return count % 3 == 0;
    }
}