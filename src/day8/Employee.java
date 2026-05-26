package day8;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Employee {
    public static void main(String[] args) {
       ArrayList<String> emp=new ArrayList<>();
       emp.add("raj");
       emp.add("rithish");
       emp.add("raj");
       LinkedHashSet<String> lhs=new LinkedHashSet<>(emp);
       System.out.println(lhs);

    }
    
}
