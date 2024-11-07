package in.itkaran.lld1200624.lld1class4.inheritance;

import in.itkaran.lld1200624.lld2.factory.AndroidUIFactory;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInheritance();
        //demoMethodOverloading();
        //demoTypeCheck();
    }

    private static void demoMethodOverloading() {
        Animal a = new Animal("Animal");
        a.fun();
        a.fun(5);
        a.fun("Hello");
        a.fun(5, "Hello");
        a.fun("Hello", 5);
    }

    private static void demoTypeCheck() {
        Animal a1 = new Dog("Blacky");
        Animal a2 = new Cat("Kitty");

        Dog d1 = (Dog) a1;  // No error
        d1.whoAmI();

        Dog d2 = (Dog) a2; // Causes ClassCastException at runtime
        d2.whoAmI();

    }

    private static void demoInheritance() {
        Lion lion = new Lion("Leo");
        lion.fun();
        lion.fun(5);
        //System.out.println("Debug");

        Animal a = new Dog("Doga");
        a.whoAmI();
        a = new Mammal("Some Mammal");
        a.whoAmI();

        // Method overriding
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Goldy"));
        animals.add(new Mammal("Bird"));
        animals.add(new Lion("Lion King"));
        animals.add(new Dog("Doga"));

        for (Animal animal : animals) {
            animal.whoAmI();
        }
    }
}
