package in.itkaran.lld1200624.lld2.decorator;

import java.util.TooManyListenersException;

public class VanillaScoop extends ToppingDecorator {

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public Double getCost() {
        return iceCream.getCost() + 70.0;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", Vanilla Scoop";
    }
}
