//question 1a

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