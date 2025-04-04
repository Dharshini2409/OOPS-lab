class Person {
    void showName() {
        System.out.println("This is a person");
    }
}

// Interface
interface Employee {
    void showEmployee();
}

// Derived class
class Manager extends Person implements Employee {
    public void showEmployee() {
        System.out.println("This is an employee who is also a manager");
    }
}

// Main class
public class HybridInheritance1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showName();      // From Person class
        m.showEmployee();  // From Employee interface
    }
}
