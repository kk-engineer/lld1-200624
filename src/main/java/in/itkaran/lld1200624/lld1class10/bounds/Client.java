package in.itkaran.lld1200624.lld1class10.bounds;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        demoBounds();
    }

    public static void fun1(List<? extends Animal> animals) {
        System.out.println("Fun1");
    }

    public static void fun2(List<? super Cat> cats) {
        System.out.println("Fun2");
    }

    public static void demoBounds() {
        List<Animal> animals = List.of(new Animal("Animal1"), new Animal("Animal2"));
        List<Cat> cats = List.of(new Cat("Cat1"), new Cat("Cat2"));
        List<Tiger> tigers = List.of(new Tiger("Tiger1"), new Tiger("Tiger2"));

        fun1(animals);
        fun2(cats);

        fun1(cats);
        fun2(animals);

        fun1(tigers);
        // fun2(tigers); -> compilation error
    }
}
