package com.bridgelabz.javaregex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserImplements implements IUser {

	Scanner fNameInput = new Scanner(System.in);
	Scanner lNameInput = new Scanner(System.in);
	Scanner emailInput = new Scanner(System.in);
	Scanner mobileInput = new Scanner(System.in);

	// UC1 - First name starts with caps and has minimum 3 characters.
	public void validateFirstName() {
		System.out.println("Enter first name: ");
		String fName = fNameInput.nextLine();

		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(fName).matches()) {
			System.out.println("First name: " + fName + " is valid.");
		} else {
			System.out.println("First name: " + fName + " is invalid.");
		}

	}

	// UC2 - Last name starts with caps and has minimum 3 characters.
	public void validateLastName() {
		System.out.println("Enter last name: ");
		String lName = lNameInput.nextLine();

		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(lName).matches()) {
			System.out.println("Last name: " + lName + " is valid.");
		} else {
			System.out.println("Last name: " + lName + " is invalid.");
		}

	}

	// UC3 - Need to validate email.
	public void validateEmail() {
		System.out.println("Enter email: ");
		String email = emailInput.nextLine();

		String regex = "^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
		Pattern pattern = Pattern.compile(regex);
		if (pattern.matcher(email).matches()) {
			System.out.println("Email: " + email + " is valid.");
		} else {
			System.out.println("Email: " + email + " is invalid.");
		}

	}

	// UC4 - Need to validate mobile number example: 91 9919819801.
	public void validateMobileNumber() {
		

	}

	public void validatePassword() {
		// TODO Auto-generated method stub

	}

	public void clearAllEmailSamples() {
		// TODO Auto-generated method stub

	}
}
