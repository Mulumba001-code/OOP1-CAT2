// Abstract class
abstract class Appliance {
    // Abstract method to be implemented by subclasses
    public abstract void turnOn();
}

// Subclass Fan that extends Appliance
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("The fan is now turned on.");
    }
}

// Subclass TV that extends Appliance
class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("The TV is now turned on.");
    }
}

// Main class to demonstrate abstraction
public class Main {
    public static void main(String[] args) {
        // Creating objects of Fan and TV
        Appliance myFan = new Fan();
        Appliance myTV = new TV();

        // Calling the turnOn() method
        myFan.turnOn(); // Output: The fan is now turned on.
        myTV.turnOn();  // Output: The TV is now turned on.
    }
}