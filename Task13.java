class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        myCar.displayDetails();
    }
}
// The code defines a Vehicle class and a Car class that extends Vehicle.
// The Car class has an additional attribute for the number of doors and a method to display thedetails of the car.
// The main method creates an instance of Car and displays its details.
// The code demonstrates inheritance and encapsulation in Java.
// The Vehicle class serves as a base class, while the Car class extends it to add specific functionality related to cars.
// The displayDetails method in the Car class prints out all relevant information about the car, showcasing the use of inheritance to build upon the base class functionality.