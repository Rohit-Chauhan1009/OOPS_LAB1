package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

public abstract class CredentiaslService implements ICredentials{

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".gl.com";
	}

	@Override
	public String generatePassword() {
		String Password ="";
		String captialLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numb = "0123456789";
		String specialCharacters = "!~@#$%^&*()_";

		String values = captialLetters+smallLetters+numb+specialCharacters;
		
		Random random = new Random();
		
		for(int i=0; i<8;i++) {
			
			int index = random.nextInt(values.length());
			char c = values.charAt(index);
			
			Password += String.valueOf(c);
		}
		return Password;
	}

	public void showCredentials(Employee empl) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("Hi "+empl.getFirstName()+" "+empl.getLastName()+"Following Credentials are: ");
		System.out.println("Email is : "+ empl.getEmail());
		System.out.println("Password is : "+ empl.getPassword());
	}


	
}
