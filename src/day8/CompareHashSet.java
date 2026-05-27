package day8;

import java.util.HashSet;
import java.util.Scanner;

public class CompareHashSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

  
        HashSet<String> set1 = new HashSet<>();
        System.out.print("Enter number of elements for Set 1: ");
        int n1 = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter elements for Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextLine());
        }

       
        HashSet<String> set2 = new HashSet<>();
        System.out.print("Enter number of elements for Set 2: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter elements for Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextLine());
        }

       
        if (set1.equals(set2)) {
            System.out.println("Both HashSets contain the SAME elements.");
        } else {
            System.out.println("The HashSets do NOT contain the same elements.");
        }
        sc.close();
    }
}