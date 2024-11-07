package in.itkaran.lld1200624.lld1class4.inheritance;

public class Dog extends Mammal {

    Dog(String name) {
        super(name);
        System.out.println("Dog " + name);
    }

    public void whoAmI() {
        System.out.println("I am a Dog");
    }
}
