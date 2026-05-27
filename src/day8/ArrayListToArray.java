package day8;
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        
        String[] array = list.toArray(new String[0]);

        
        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}