package in.itkaran.lld1200624.lld1class5.interfaces;

public class Eagle implements Bird{

    @Override
    public void move() {
        System.out.println("Eagle moves");
    }

    public void eat() {
        System.out.println("Eagle eats");
    }

    public void fly() {
        System.out.println("Eagle flies");
    }
}
