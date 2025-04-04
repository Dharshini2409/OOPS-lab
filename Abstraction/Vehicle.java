abstract class Vehicle {
    String brand;

    // Constructor in abstract class
    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start(); // Abstract method

    void showBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

// Concrete class
class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void start() {
        System.out.println("Car is starting...");
    }
}

// Main class
public class AbstractExample2 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.showBrand();
        myCar.start();
    }
}
