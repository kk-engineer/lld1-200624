package in.itkaran.lld1200624.lld1class5.abstractclasses;

public class Client {
    public static void main(String[] args) {
        demoAbstractClass();
    }

    private static void demoAbstractClass() {
        Tiger tiger = new Tiger();
        tiger.move();
        //Mammal mammal = new Mammal();
        Mammal mammal = new Tiger();

        Whale whale = new BlueWhale();
        whale.move();
    }
}
