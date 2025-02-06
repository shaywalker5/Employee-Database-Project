package employee_pkg;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails{
	
	public String name;
	public int employeeId;
	public LocalDate dateofEmployment; 
	public double salary;
	
	static Scanner userInput = new Scanner(System.in);
	
	static EmployeeDetails addEmployeeDetails() {
		
		EmployeeDetails employee = new EmployeeDetails();
		
		System.out.println("Enter employee's full name:");
		
		if (userInput.hasNextLine()) {
			employee.setName(userInput.nextLine());
		}
		
		System.out.println("Enter employee's ID: ");
		
		if (userInput.hasNextInt()) {
			employee.setEmployeeId(userInput.nextInt());
		}
		
		System.out.println("Enter employee's date of employment (YYYY-MM-DD): ");
		
		if (userInput.hasNext()) {
            employee.setDateofEmployment(LocalDate.parse(userInput.next())); 
        }
		
		System.out.println("Enter employee's salary:");
		
		if (userInput.hasNextDouble()) {
            employee.setSalary(userInput.nextDouble());
        }
		
		return employee;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		 this.employeeId = employeeId;
	}

	public LocalDate getDateofEmployment() {
		return dateofEmployment;
	}

	public void setDateofEmployment(LocalDate dateofEmployment) {
		this.dateofEmployment = dateofEmployment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//static EmployeeDetails listEmployeeDetails() {
//	
////	private static List<EmployeeDetails> employees = new ArrayList<>();
////	if (!employees) {
////        System.out.println("No employees have been added yet.");
////    } else {
//        System.out.println("\nList of Employees:");
//        for (EmployeeDetails employee : employees) {
//            System.out.println("Name: " + employee.getName());
//            System.out.println("Employee ID: " + employee.getEmployeeId());
//            System.out.println("Date of Employment: " + employee.getDateofEmployment());
//            System.out.println("Salary: " + employee.getSalary());
//            System.out.println("---------------------------");
//        }
//    }


public static void main(String[] args) {
	EmployeeDetails newEmployee = addEmployeeDetails();
	
	System.out.println("\nEmployee Details:");
    System.out.println("Name: " + newEmployee.getName());
    System.out.println("ID: " + newEmployee.getEmployeeId());
    System.out.println("Date of Employment: " + newEmployee.getDateofEmployment());
    System.out.println("Salary: " + newEmployee.getSalary());
} 
}