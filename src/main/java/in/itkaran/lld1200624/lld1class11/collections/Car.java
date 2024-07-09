package in.itkaran.lld1200624.lld1class11.collections;

public class Car implements Comparable<Car> {

    private String model;
    private int price;
    private int maxSpeed;

    public Car(String model, int price, int maxSpeed) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public int compareTo(Car other) {
        //return this.price - other.price;
        // Desc
        //return other.price - this.price;
        // compare strings
        return this.model.compareTo(other.model);
    }

    public String toString() {
        return this.model + " - " + this.price + " - " + this.maxSpeed;
    }
}
