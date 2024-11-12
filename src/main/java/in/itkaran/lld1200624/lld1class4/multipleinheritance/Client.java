package in.itkaran.lld1200624.lld1class4.multipleinheritance;

public class Client {
    public static void main(String[] args) {
        demoMultipleInheritance();
    }

    private static void demoMultipleInheritance() {
        Lion lion = new Lion();
        lion.walk();
        lion.hunt();
        lion.eatMeat();

    }
}
