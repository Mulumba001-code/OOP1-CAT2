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