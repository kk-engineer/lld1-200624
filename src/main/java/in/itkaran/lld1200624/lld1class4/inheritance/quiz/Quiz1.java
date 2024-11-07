package in.itkaran.lld1200624.lld1class4.inheritance.quiz;

class A {
    int x = 10;

    void display() {
        System.out.println("Class A: x = " + x);
    }
}

class B extends A {
    int x = 20;

    @Override
    void display() {
        System.out.println("Class B: x = " + x);
    }
}

class C extends B {
    int x = 30;

    @Override
    void display() {
        System.out.println("Class C: x = " + x);
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        A obj = new C();
        obj.display();
        System.out.println("x = " + obj.x);
    }
}

