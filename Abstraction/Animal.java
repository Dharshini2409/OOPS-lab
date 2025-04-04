abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() {
        System.out.println("Animals sleep...");
    }
}

// Concrete class
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class AbstractExample1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls overridden method
        myDog.sleep();     // Calls parent class method
    }
}
