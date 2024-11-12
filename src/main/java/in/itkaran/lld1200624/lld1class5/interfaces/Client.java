package in.itkaran.lld1200624.lld1class5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInterface();
    }

    private static void demoInterface() {
        Animal.doSomething();
        System.out.println(Animal.limbs);
        System.out.println(Animal.eyes);
        Lion lion = new Lion();
        lion.move();
        lion.eat();
        lion.fly();

        Eagle eagle = new Eagle();
        eagle.soar();

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(new Eagle());

        for (Animal animal : animals) {
            animal.fly();
        }

        lion.see();
        eagle.see();
        // break till 8:10 am
    }
}
