class Animal {
    void makeSound() {
        System.out.println("Animals make sounds");
    }
}

// Parent class
class Mammal extends Animal {
    void type() {
        System.out.println("I am a mammal");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class MultilevelInheritance1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // From Animal class
        myDog.type();      // From Mammal class
        myDog.bark();      // From Dog class
    }
}
