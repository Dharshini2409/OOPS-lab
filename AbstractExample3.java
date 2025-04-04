abstract class Shape {
    abstract void draw();
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class
public class AbstractExample3 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}
