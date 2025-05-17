package Polymorphism;

// Parent class
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

// Subclasses
class Car extends Vehicle {
    void move() {
        System.out.println("Car is driving on the road.");
    }

    void openSunroof() {
        System.out.println("Car sunroof is open.");
    }
}

class Ship extends Vehicle {
    void move() {
        System.out.println("Ship is sailing on water.");
    }

    void anchor() {
        System.out.println("Ship anchor is down.");
    }
}

class Airoplane extends Vehicle {
    void move() {
        System.out.println("Airplane is flying in the sky.");
    }

    void autopilot() {
        System.out.println("Airplane is on autopilot mode.");
    }
}

public class MainOverriding {
    public static void main(String[] args) {

        // Upcasting
        Vehicle v = new Car();   // Upcasting
        v.move();                // Car's move()

        // Downcasting back to Car
        Car c = (Car) v;         // Downcasting
        c.openSunroof();         // Now Car-specific method is accessible

        // Upcasting
        v = new Ship();          // Upcasting
        v.move();                // Ship's move()

        // Downcasting
        Ship s = (Ship) v;       // Downcasting
        s.anchor();              // Ship-specific method

        // Upcasting
        v = new Airoplane();     // Upcasting
        v.move();                // Airoplane's move()

        // Downcasting
        Airoplane a = (Airoplane) v; // Downcasting
        a.autopilot();               // Airoplane-specific method
    }
}
