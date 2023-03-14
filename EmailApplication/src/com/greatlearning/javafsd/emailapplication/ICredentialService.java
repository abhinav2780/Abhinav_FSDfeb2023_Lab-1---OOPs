package com.greatlearning.javafsd.emailapplication;

public interface ICredentialService {

	String generatePassword();
	
	String generateEmailAddress(Employee employee);
	
	void displayCredentials(Employee employee);   // Showing details in the console
	
	
	
}
