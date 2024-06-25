package in.itkaran.lld1200624.lld1class5.abstractclasses;

public abstract class Mammal {
    int limbs;
    String name;

    abstract void move();
    void eat() {
        System.out.println("Mammal eats");
    }
}
