package Class_And_Object;

public class Student_P extends Person{
	
	private int studentId;

    // Constructor
    public Student_P(String name, int age, int studentId) {
        super(name, age); // Call to superclass constructor (Person)
        this.studentId = studentId;
    }

    // Getter setter for studentId
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


// Demonstrate inheritance
    public static void main(String[] args) {
        
        // Create a Person object
    Person per = new Person("Rajesh Kumar", 30);

    // Display person details
    System.out.println("Person Details:");
    System.out.println("Name: " + per.getName());
    System.out.println("Age: " + per.getAge());
    System.out.println();

    // Create a Student_P object
    Student_P std = new Student_P("Md Shahid", 20, 12345);

    // Display student details
    System.out.println("Student Details:");
    System.out.println("Name: " + std.getName());
    System.out.println("Age: " + std.getAge());
    System.out.println("Student ID: " + std.getStudentId());
   
    }
}