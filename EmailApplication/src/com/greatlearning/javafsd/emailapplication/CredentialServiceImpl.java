package com.greatlearning.javafsd.emailapplication;

public class CredentialServiceImpl implements ICredentialService{

	private Employee employee;
	
	
	@Override
	public String generatePassword() {
		
		PasswordGenerator generator = new PasswordGenerator();
		
		String password = generator.generate();
		
		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartment();
		
		//Format for email address is firstname.lastname@deparment.greatlearning.com
		
		StringBuilder emailBuilder = new StringBuilder();  //Concatenate Strings for email address
		
		emailBuilder.append(firstName.toLowerCase());
		emailBuilder.append(".");
		emailBuilder.append(lastName.toLowerCase());
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".greatlearning.com");
		
		String emailAddress = emailBuilder.toString();
		
		employee.setEmailAddress(emailAddress);
					
		return emailAddress;
	}

	@Override
	public void displayCredentials(Employee employee) {
		
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Dear ");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(",");
		messageBuilder.append(" your generated credentials are as follows" + "\n");
				
		
		String newline = System.getProperty("line.seperator");
		//messageBuilder.append(newline);
		messageBuilder.append("Email ---> ");
		messageBuilder.append(employee.getEmailAddress());
		
		
		//messageBuilder.append(newline);
		messageBuilder.append("\n" + "Password ---> ");
		messageBuilder.append(employee.getPassword());
		
		String finalMessage = messageBuilder.toString();
		System.out.println(finalMessage);		
		
	}
	
}
