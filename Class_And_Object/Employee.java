package Class_And_Object;

public class Employee {
	
//	2. Create a class Employee with private fields name and salary. Provide public getter and setter methods for these fields.
	
	    private String name;
	    private double salary;

	    // Constructor
	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    // Getter setter for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter setter for salary
	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }


	public static void main(String[] args) {
		
		// Object
        Employee emp = new Employee("Md Shahid", 50000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        
//        if we want to update details then we need to used this process. 
        emp.setName("Rajesh Kumar");
        emp.setSalary(60000.0);

        System.out.println("Updated Employee Name: " + emp.getName());
        System.out.println("Updated Employee Salary: " + emp.getSalary());

	}
}
