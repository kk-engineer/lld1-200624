package in.itkaran.lld1200624.lld1class11.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Client {

    public static void main(String[] args) {
        demoComparable();

    }

    private static void demoComparable() {

        Car car1 = new Car("Ferrari", 50, 500);
        Car car2 = new Car("GM", 20, 200);
        Car car3 = new Car("BMW", 30, 400);
        Car car4 = new Car("Buggati", 40, 350);
        Car car5 = new Car("Mercedes", 40, 250);

        Queue<Car> pqCars = new PriorityQueue<>();
        pqCars.add(car1);
        pqCars.add(car2);
        pqCars.add(car3);
        pqCars.add(car4);
        pqCars.add(car5);

        while(!pqCars.isEmpty()) {
            Car car = pqCars.poll();
            System.out.println(car);
        }

    }
}
