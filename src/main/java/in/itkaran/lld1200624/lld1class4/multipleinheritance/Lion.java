package in.itkaran.lld1200624.lld1class4.multipleinheritance;

public class Lion implements Cat {

    @Override
    public void hunt() {
        System.out.println("Lion is hunting");
    }

    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }

    @Override
    public void eatMeat() {
        System.out.println("Lion is eating meat");
    }
}
