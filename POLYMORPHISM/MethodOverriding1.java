class Parent {
    void show() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    // Overriding method
    void show() {
        System.out.println("This is Child class");
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        Parent obj = new Child(); // Dynamic Method Dispatch
        obj.show(); // Calls Child's method
    }
}
