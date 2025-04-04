class Student {
    String name;

    // Default constructor
    Student() {
        name = "Unknown";
    }

    void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
