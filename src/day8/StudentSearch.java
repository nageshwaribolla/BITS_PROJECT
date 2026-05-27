package day8;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {

        
        ArrayList<String> students = new ArrayList<>();
        students.add("Ravi");
        students.add("Priya");
        students.add("Kiran");
        students.add("Anusha");
        students.add("Mahesh");

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter student name to search: ");
        String name = sc.nextLine();

        
        boolean found = false;
        for (String s : students) {
            if (s.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }

      
        if (found) {
            System.out.println(name + " is present in the list.");
        } else {
            System.out.println(name + " is NOT present in the list.");
        }
        sc.close();
    }
}