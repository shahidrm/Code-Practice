package Class_And_Object;

public class Student {

	    private String name;
	    private int age;

	    // Constructor
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {
	    Student std = new Student("John Doe", 20);
	    
	    System.out.println("Student Name: " + std.getName());
	    System.out.println("Student Age: " + std.getAge());
	    
	    }	
}
