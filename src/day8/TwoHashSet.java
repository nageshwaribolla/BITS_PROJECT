package day8;

import java.util.HashSet;

public class TwoHashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(5);
        HashSet<Integer> s2=new HashSet<>();
        s2.add(1);
        s2.add(3);
        s2.add(5);
        s1.addAll(s2);
        //System.out.println(s1);
        //s1.retainAll(s2);
        //System.out.println(s1);
        System.out.println(s1.containsAll(s2));

    }
    
}
