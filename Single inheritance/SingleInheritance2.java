class Animal {
    Animal() {
        System.out.println("An animal is created");
    }

    void eat() {
        System.out.println("Animals eat food");
    }
}

// Child class
class Dog extends Animal {
    Dog() {
        System.out.println("A dog is created");
    }

    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class SingleInheritance2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // From parent class
        myDog.bark(); // From child class
    }
}
