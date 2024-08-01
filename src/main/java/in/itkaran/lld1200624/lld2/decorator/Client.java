package in.itkaran.lld1200624.lld2.decorator;

public class Client {
    public static void main(String[] args) {

        demoDecorator();
    }

    private static void demoDecorator() {
        // create a base ice-cream
        IceCream iceCream = new ChocoCone();

        // Add toppings
        iceCream = new VanillaScoop(iceCream);
        iceCream= new ChocoScoop(iceCream);
        iceCream= new PistaScoop(iceCream);
        iceCream = new Cherry(iceCream);

        System.out.println("Description: " + iceCream.getDescription());
        System.out.println("Cost: " + iceCream.getCost());


    }
}
