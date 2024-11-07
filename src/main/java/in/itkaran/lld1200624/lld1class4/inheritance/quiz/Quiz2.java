package in.itkaran.lld1200624.lld1class4.inheritance.quiz;

class Engine {
    int horsepower;

    Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    // Copy constructor for deep copying
    Engine(Engine other) {
        this.horsepower = other.horsepower;
    }
}

class Car {
    String model;
    Engine engine;

    Car(String model, int horsepower) {
        this.model = model;
        this.engine = new Engine(horsepower);
    }

    // Copy constructor for deep copying
    Car(Car other) {
        this.model = other.model;
        this.engine = new Engine(other.engine);  // Deep copy of engine
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 500);
        Car car2 = new Car(car1);  // Using the copy constructor

        car2.model = "BMW";
        car2.engine.horsepower = 300;

        System.out.println("car1 model: " + car1.model + ", horsepower: " + car1.engine.horsepower);
        System.out.println("car2 model: " + car2.model + ", horsepower: " + car2.engine.horsepower);
    }
}

