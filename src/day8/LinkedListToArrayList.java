package day8;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListToArrayList {
    public static void main(String[] args) {

       
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Nagi");
        linkedList.add("Rasu");
        linkedList.add("Manju");

        
        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        System.out.println("ArrayList elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}