class Animal {
    void eat() {
        System.out.println("Animals eat food");
    }
}

// Interface 1
interface Walkable {
    void walk();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Child class implementing multiple interfaces
class Frog extends Animal implements Walkable, Swimmable {
    public void walk() {
        System.out.println("Frog walks on land");
    }

    public void swim() {
        System.out.println("Frog swims in water");
    }
}

// Main class
public class HybridInheritance2 {
    public static void main(String[] args) {
        Frog myFrog = new Frog();
        myFrog.eat();  // From Animal class
        myFrog.walk(); // From Walkable interface
        myFrog.swim(); // From Swimmable interface
    }
}
