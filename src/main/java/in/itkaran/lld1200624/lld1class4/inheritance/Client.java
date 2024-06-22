package in.itkaran.lld1200624.lld1class4.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInheritance();
    }

    private static void demoInheritance() {
        Lion lion = new Lion("Leo");
        lion.fun();
        lion.fun(5);
        //System.out.println("Debug");

        Animal a = new Dog("Leo");
        a.whoAmI();
        a = new Mammal("Dog");
        a.whoAmI();


        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Goldy"));
        animals.add(new Mammal("Bird"));
        animals.add(new Lion("White"));
        animals.add(new Dog("Dog"));

        for (Animal animal : animals) {
            animal.whoAmI();
        }
    }
}
