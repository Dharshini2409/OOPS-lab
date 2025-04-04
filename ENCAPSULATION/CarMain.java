class Car {
    private String model;
    private int speed;
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setSpeed(120);
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Speed: " + car.getSpeed() + " km/h");
    }
}
