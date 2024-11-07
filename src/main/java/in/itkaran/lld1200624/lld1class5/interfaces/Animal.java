package in.itkaran.lld1200624.lld1class5.interfaces;

public interface Animal {
    static int limbs = 4;
    int eyes = 2;

    void move();
    void eat();
    default void fly() {
        System.out.println("Oops cant fly!");
        doNothing();
        doSomething();
    }

    default void run() {
        System.out.println("Oops cant run!");
        doNothing();
        doSomething();
    }

    private void doNothing() {
        System.out.println("Animal - Doing nothing");
    }

    static void doSomething() {
        // limbs = 5;   // cannot change value of final variable
        System.out.println("Animal - Doing something");
    }

    default void see() {
        // eyes = 3; // cannot change value of final variable
        System.out.println("Animal - Seeing with " + eyes + " eyes");
    }
}
