package in.itkaran.lld1200624.lld1class4.inheritance;

public class Cat extends Mammal{

    Cat(String name){
        super(name);
        System.out.println("Cat " + name);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a Cat");
    }
}
