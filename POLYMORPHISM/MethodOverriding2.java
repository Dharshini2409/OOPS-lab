class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    // Overriding method
    void sound() {
        super.sound(); // Calling parent class method
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
}
