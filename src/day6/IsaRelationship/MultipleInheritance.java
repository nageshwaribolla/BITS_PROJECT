package day6.IsaRelationship;

interface A {       
    void m1();
}

interface B {      
    void m1();
}

class C implements A, B {   

    public void m1() {
        System.out.println("m1 in C");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1();   
    }
}