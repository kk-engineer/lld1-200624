package in.itkaran.lld1200624.lld2.decorator;

public class PistaScoop extends ToppingDecorator {
    public PistaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public Double getCost() {
        return iceCream.getCost() + 90.0;
    }

    public String getDescription() {
        return iceCream.getDescription() + " , Pista Scoop ";
    }
}
