package in.itkaran.lld1200624.lld2.decorator;

public class Cherry extends ToppingDecorator {
    public Cherry(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public Double getCost() {
        return iceCream.getCost() + 5.0;
    }

    public String getDescription() {
        return iceCream.getDescription() + " , Cherry ";
    }
}
