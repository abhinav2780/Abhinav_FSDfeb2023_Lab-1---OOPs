package com.greatlearning.javafsd.emailapplication.test;

import com.greatlearning.javafsd.emailapplication.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapplication.Employee;
import com.greatlearning.javafsd.emailapplication.PasswordGenerator;

public class CredentialServiceImplTest {

	public static void main(String[] args) {
		
		testEmailAddressGeneration();
		testPasswordGeneration();
		testDisplayCredentials();
				
	}
		
	static void testEmailAddressGeneration() {
		
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		
		Employee amit = new Employee ("Amit", "Sharma", "technical");
		
		String emailAddress = serviceImpl.generateEmailAddress(amit);
		
		System.out.println(emailAddress);
				
	}
	
	static void testPasswordGeneration() {
	
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		
		String password = serviceImpl.generatePassword();
		System.out.println("Password -->" + password);
			
	}
	
	static void testDisplayCredentials() {
		
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		
		Employee amit = new Employee ("Amit", "Sharma", "technical");
		
		serviceImpl.generateEmailAddress(amit);
		String password = serviceImpl.generatePassword();
		amit.setPassword(password);
		
		serviceImpl.displayCredentials(amit);
		
		
	}
	
}
