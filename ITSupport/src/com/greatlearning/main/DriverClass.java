package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

public class DriverClass {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Please enter your First Name : ");
		String firstName = S.next();
		
		System.out.println("Please enter your Last Name : ");
		String lastName = S.next();
		
		Employee empl = new Employee(firstName, lastName);
		
		System.out.println("Please enter the Department from the following");
		System.out.println("1. Tech");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int Opt = S.nextInt();
		String generatedEmail = null;
		String generatedPassword = null;
		
		ICredentials ic = new CredentialService();
		switch (Opt) {
		
			case 1:
				generatedEmail=ic.generateEmailAddress(firstName, lastName, "Tech");
				generatedPassword =ic.generatePassword();
				
				break;
				
			case 2:
				generatedEmail=ic.generateEmailAddress(firstName, lastName, "Admin");
				generatedPassword =ic.generatePassword();
				
				break;
			case 3:
				generatedEmail=ic.generateEmailAddress(firstName, lastName, "HR");
				generatedPassword =ic.generatePassword();
				
				break;
			case 4:
				generatedEmail=ic.generateEmailAddress(firstName, lastName, "Legal");
				generatedPassword =ic.generatePassword();
				
				break;
			
			default:{
				System.out.println("Enter a valid option");
			}
		}
		
		empl.setEmail(generatedEmail);
		empl.setPassword(generatedPassword);
		
		ic.showCredentials(empl);
	}
}










