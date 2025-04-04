class Display {
    // Method 1: Displaying integer
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    // Method 2: Displaying double
    void show(double a) {
        System.out.println("Double: " + a);
    }

    // Method 3: Displaying string
    void show(String a) {
        System.out.println("String: " + a);
    }

    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(10);
        obj.show(10.5);
        obj.show("Hello");
    }
}
