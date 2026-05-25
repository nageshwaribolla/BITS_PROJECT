package day5;

import java.util.Scanner;

public class FibonaccRecursion {

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);  // correct recursive formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}