package employee_pkg;

import java.util.Scanner;



public class employees {
	
	public static void mainMenu() {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the Employee Database");
		System.out.println("Choose an item from the menu");
		System.out.println("1. List Employees");
		System.out.println("2. Add new Employee");
		System.out.println("3. Update new Employee");
		System.out.println("4. Remove Employee");
		
		int input = userInput.nextInt();
		
		switch (input) {
		
		case 1:
			
			break;
		case 2:
			EmployeeDetails newEmployee = EmployeeDetails.addEmployeeDetails();
			break;
		case 3: 
//			updateEmployee();
			break;
		case 4: 
//			deleteEmployee();
			break;
		default:
			System.out.println("Invalid entry");
			break;
			
		}
	}

	public static void main(String[] args) {
		
		mainMenu();
		
	}
}