class Car {
    String make;
    String model;
    int year;
    String color;
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
public class CarDetails {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Inova", 2020, "Red");
        Car car2 = new Car("Mahindra", "XUV700", 2023, "Black");
        car1.displayDetails();
        car2.displayDetails();
    }
}