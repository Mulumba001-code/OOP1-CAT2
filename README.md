# OOP1-CAT2
## 196410

Question 1 a

Explanation 
Private Attributes:
The class has two private attributes: grade (of type int) and name (of type String).  
Methods for Getters and Setters:  
The name attribute can be accessed using the getName() and setName(String name) methods.  
The grade attribute can be accessed using the getGrade() and setGrade(int grade) methods. If the 
value falls between 0 and 100, the grader verifies it. Otherwise, the grade is set to zero.  
Constructor: The name and grade attributes are initialized using the constructor, which uses the grade 
setter to make sure the value is correct when the object is created.

```java
public class Student { 
    // Private attributes 
    private String name; 
    private int grade; 
 
    // Constructor 
    public Student(String name, int grade) { 
        this.name = name; 
        setGrade(grade); // Use the setter to ensure grade is valid 
    } 
 
    // Public getter for name 
    public String getName() { 
        return name; 
    } 
 
    // Public setter for name 
    public void setName(String name) { 
        this.name = name; 
    } 
 
    // Public getter for grade 
    public int getGrade() { 
        return grade; 
    } 
 
    // Public setter for grade 
    public void setGrade(int grade) { 
        if (grade < 0 || grade > 100) { 
            this.grade = 0; // Set to 0 if grade is out of bounds 
        } else { 
            this.grade = grade; 
        } 
    } 
}
```

Question 1 b

Explanation:  
Method Overloading
 There are two multiply() methods in the MathOperations class: 
 One that returns the product of two integers. 
 Another that returns the product of three integers. 
 Overriding the method: 

 The Dog and Cat subclasses override the makeSound() method from the Animal class. 
 The makeSound() method is implemented differently by each subclass. 
 Polymorphism :

 We create instances of Dog and Cat in the Main class, but we refer to them as Animal. 
 Polymorphism is demonstrated by the execution of the overridden methods in the corresponding 
subclasses when we call makeSound() on these references. 

```java
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
```

Question 2 a

An explanation:

Abstraction:
 The Appliance class is an abstract class with an abstract method called turnOn(), which 
must be implemented by any subclass that extends Appliance. 
 Subclasses:

  The Fan and TV classes extend the Appliance class and offer concrete implementations of 
the turnOn() method, each of which specifies what it means to "turn on" that particular appliance. 
The Appliance interface allows us to treat various appliance types uniformly, and when we call the 
turnOn() method on each object, the specific implementation for that appliance is executed. This 
illustrates how abstraction enables us to define a common interface while providing specific 
behaviour in subclasses. To illustrate this, we create instances of Fan and TV in the Main class using 
the Appliance reference type.

```java
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
```

Question 2 b

Explanation: 
Importing Scanner:
 In order to read user input, the application imports the Scanner class.  
User input: The user is prompted to input two digits. FirstNumber contains the first number, whereas 
secondNumber contains the second number.  
Try-Catch Block: 

Within a try block, the division process is carried out. An ArithmeticException will be raised if the 
second number is zero.  
The message "Cannot divide by zero!" is printed after the catch block captures this exception.  
Lastly, Block: The Scanner object is closed using the finally block, which guarantees that resources are 
released appropriately. 

```java
import java.util.Scanner; 
 
public class DivisionCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Accepting two numbers from the user 
        System.out.print("Enter the first number: "); 
        double firstNumber = scanner.nextDouble(); 
 
        System.out.print("Enter the second number: "); 
        double secondNumber = scanner.nextDouble(); 
 
        try { 
            // Attempting to divide the first number by the second 
            double result = firstNumber / secondNumber; 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) { 
            // Handling the case where the second number is zero 
            System.out.println("Cannot divide by zero!"); 
        } finally { 
            // Closing the scanner 
            scanner.close(); 
        } 
    } 
} 
```
