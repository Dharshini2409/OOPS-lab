class Person {
    String name;
    int age;

    // Constructor 1: Default
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2: Parameterized
    Person(String n) {
        name = n;
        age = 18;
    }

    // Constructor 3: Parameterized with both name and age
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("John");
        Person p3 = new Person("Alice", 25);

        p1.display();
        p2.display();
        p3.display();
    }
}
