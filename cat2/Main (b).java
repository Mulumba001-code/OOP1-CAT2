// Class to demonstrate method overloading
class MathOperations {
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

// Abstract class for animals
abstract class Animal {
    // Abstract method to be overridden
    public abstract void makeSound();
}

// Subclass Dog that overrides makeSound
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat that overrides makeSound
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to test the implementations
public class Main {
    public static void main(String[] args) {
        // Testing method overloading
        MathOperations mathOps = new MathOperations();
        System.out.println("Multiplying two integers: " + mathOps.multiply(5, 10)); // Output: 50
        System.out.println("Multiplying three integers: " + mathOps.multiply(2, 3, 4)); // Output: 24

        // Demonstrating method overriding and polymorphism
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
    }
}
