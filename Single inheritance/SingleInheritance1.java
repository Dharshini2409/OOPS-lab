class Vehicle {
 void showType() {
 System.out.println("This is a vehicle");
 }
}
// Child class
class Car extends Vehicle {
 void showCar() {
 System.out.println("This is a car");
 }
}
// Main class
public class SingleInheritance1 {
 public static void main(String[] args) {
 Car myCar = new Car();
 myCar.showType(); // Parent class method
 myCar.showCar(); // Child class method
 }
}
