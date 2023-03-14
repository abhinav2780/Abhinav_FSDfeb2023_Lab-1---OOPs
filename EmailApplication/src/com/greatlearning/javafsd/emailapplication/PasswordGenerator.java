package com.greatlearning.javafsd.emailapplication;

import java.util.Random;

public class PasswordGenerator {

	public String generate() {
		
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialCharacters = "~!@#$%^&*()";
		
		String combinedString = smallLetters + capitalLetters + numbers + specialCharacters;
		
		Random randomObj = new Random();
		
		StringBuilder passwordBuilder = new StringBuilder();
		
		for (int index = 1; index<=8; index++) {
			
			int length = combinedString.length();
			//System.out.println("Length -->" + length);
			
			int randomIndex = randomObj.nextInt(length);  // to define the upper bound for all letters combined
			//System.out.println("Random index -->" + randomIndex);
			
			char charValue = combinedString.charAt(randomIndex);
			//System.out.println("Char Value -->" + charValue);
			
			passwordBuilder.append(charValue);
			
		}
		
		String password = passwordBuilder.toString();
				
		return password;
			
	}
		
}
