interface Animal {
    void makeSound(); // Abstract method
}

// Implementing class
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Main class
public class InterfaceExample3 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}
