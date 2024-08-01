package in.itkaran.lld1200624.lld2.decorator;

public class ChocoScoop extends ToppingDecorator {
    public ChocoScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public Double getCost() {
        return iceCream.getCost() + 80.0;
    }

    public String getDescription() {
        return iceCream.getDescription() + " , Choco Scoop ";
    }
}
