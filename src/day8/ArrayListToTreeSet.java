package day8;
import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListToTreeSet {
    public static void main(String[] args) {

    
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Kiran");
        list.add("Anusha");
        list.add("Mahesh");
        list.add("Ravi");   

        TreeSet<String> set = new TreeSet<>(list);

        System.out.println("TreeSet elements:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}