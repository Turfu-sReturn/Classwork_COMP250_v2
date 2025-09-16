import java.util.random.*;

public class Car {
    // Declare data here
    public String color;
    public double brand;
    public int year;
    public int speed;

    public Car(String color, double brand, int year) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        // Only accessible inside this class (private)
        this.speed = 0;
    }

    public Car() {
        System.out.println("Creating new empty car...");
    }

    private void changeSpeed (int newSpeed) {
        this.speed = newSpeed;
    }

    private void honk() {
        System.out.println("Beep Beep!");
    }

    // main method
    public static void main (String[] args) {
        Car myCar = new Car("Red", 18999.99, 2020);
        myCar.changeSpeed(90);
        System.out.println(myCar.speed);
    }
}
