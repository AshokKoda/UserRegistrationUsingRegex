package com.bridgelabz.javaregex;

import java.util.regex.Pattern;

import org.junit.Test;

public class UserRegistrationTest {

	// UC1 - First name starts with caps and has minimum 3 characters.
	@Test
	public void validateFirstNameTest() {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		String fName = "Koda";

		if (pattern.matcher(fName).matches()) {
			System.out.println("First name: " + fName + " is valid.");
		} else {
			System.out.println("First name: " + fName + " is invalid.");
		}

	}

	// UC2 - Last name starts with caps and has minimum 3 characters.
	@Test
	public void validateLastNameTest() {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		String lName = "Ashok";

		if (pattern.matcher(lName).matches()) {
			System.out.println("Last name: " + lName + " is valid.");
		} else {
			System.out.println("Last name: " + lName + " is invalid.");
		}

	}

	// UC3 - Need to validate email.
	@Test
	public void validateEmailTest() {
		String regex = "^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
		Pattern pattern = Pattern.compile(regex);
		String email = "abc-100@abc.net";

		if (pattern.matcher(email).matches()) {
			System.out.println("Email: " + email + " is valid.");
		} else {
			System.out.println("Email: " + email + " is invalid.");
		}

	}
}
