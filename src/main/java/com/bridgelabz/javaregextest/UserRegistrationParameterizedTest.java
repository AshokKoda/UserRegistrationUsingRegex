package com.bridgelabz.javaregextest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {

	private String actualResult;
	private String expectedResult;
	private UserRegistration read;

	// Constructor
	public UserRegistrationParameterizedTest(String actualResult, String expectedResult) {
		this.actualResult = actualResult;
		this.expectedResult = expectedResult;
	}

	@Before
	public void init() {
		read = new UserRegistration();
	}

	@Parameterized.Parameters
	public static Collection emailInput() {
		return Arrays
				.asList(new Object[][] { { "ashok@@yahoo.com", "InValid" }, { "abc.xyz@bl.co.india", "InValid" },
						{ "abc.xyz$bl.co.in", "InValid" }, { "abc.xyz@bl.co.in", "Valid" } });
	}

	@Parameterized.Parameters
	public static Collection passwordInput() {
		return Arrays.asList(new Object[][] { { "Abccc@123", "InValid" }, { "abccc@@@123", "InValid" },
				{ "Ac@123", "InValid" }, { "AAAAAA@123A", "InValid" } });
	}

	@Test
	public void testEmail() {
		assertEquals(expectedResult, read.email(actualResult));
	}

	@Test
	public void testPassword() {
		assertEquals(expectedResult, read.password(actualResult));
	}
}
