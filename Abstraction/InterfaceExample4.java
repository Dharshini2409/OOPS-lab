interface Flyable {
    void fly();
}

// Second interface
interface Swimable {
    void swim();
}

// Class implementing multiple interfaces
class Bird implements Flyable, Swimable {
    public void fly() {
        System.out.println("Bird flies in the sky");
    }

    public void swim() {
        System.out.println("Bird can swim in water");
    }
}

// Main class
public class InterfaceExample4 {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly();
        myBird.swim();
    }
}
