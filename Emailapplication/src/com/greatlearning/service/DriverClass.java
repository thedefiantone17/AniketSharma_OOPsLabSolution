package com.greatlearning.service;
 
import java.util.Scanner;


import com.greatlearning.model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		Employee employee = new Employee("Aniket","Sharma");
		String generatedEmail;
		char[] generatedPassword;
		CredentialService cService = new CredentialService();
		Scanner scan = new Scanner(System.in);
		int choice;
		
		
		System.out.println("Please enter your department from the following:");
		System.out.println("1. Technical Dept.");
		System.out.println("2. Admin Dept.");
		System.out.println("3. Human Resource Dept.");
		System.out.println("4. Legal Dept.");
		
		choice = scan.nextInt();
		
		if (choice == 1) {
			generatedEmail = cService.generateEmailaddress(employee.getFirstName(), employee.getLastName(), "Technical");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else if (choice == 2) {
			generatedEmail = cService.generateEmailaddress(employee.getFirstName(), employee.getLastName(), "Admin");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else if (choice == 3) {
			generatedEmail = cService.generateEmailaddress(employee.getFirstName(), employee.getLastName(), "HR");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else if (choice == 4) {
			generatedEmail = cService.generateEmailaddress(employee.getFirstName(), employee.getLastName(), "Legal");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else {
			System.out.println("Invalid input!");
		}
	
	}
}
