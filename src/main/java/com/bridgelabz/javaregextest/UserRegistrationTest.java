package com.bridgelabz.javaregextest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenTextWhenItContainsFirstCapsInFnameAndMinThreeAlphabetsShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		String actual = user.fName("Koda");
		String expected = "Valid";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void givenTextWhenItDoesNotContainsFirstCapsInFnameShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		String actual = user.fName("koda");
		String expected = "InValid";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void givenTextWhenItContainsFirstCapsInFnameButNotMinThreeCharShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		String actualResult = user.fName("Ko");
		String expectedResult = "InValid";
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void givenTextWhenItDoesNotContainsFirstCapsInlnameShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		String actualResult = user.lName("ashok");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenTextWhenItContainsFirstCapsInlnameButNotMinThreeCharShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		String actualResult = user.lName("as");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenDoesNotContainsAtTheRateShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("kuabc.yahoo.com");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenDoesNotContainsabcShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("xyz.yahoo.co.in");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsMoreThanThreeCharAtLastShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("xyz.yahoo.co.india");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsMoreThanTwoTLDShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("xyz.yahoo.co.in.co");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsOneCharInTLDShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("xyz.yahoo.co.i");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsDoubleDotsShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("xyz..yahoo.co.i");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsSpecialCharacterShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("xyz.yahoo.c@.i");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsDigitsInTLDShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("xyz.yahoo.c1.i");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenAccordingToProperReqShouldReturnTrue() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.email("abc.xyz@bl.co.in");
		String expectedRes = "Valid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithSpaceAndProperNumberShouldReturnTrue() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.mobile("91 8123434456");
		String expectedRes = "Valid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithoutSpaceAndProperNumberShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.mobile("918123434456");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithSpaceButNotProperCountryCodeShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.mobile("348123434456");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutAnUpperCaseShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.password("abccc@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutASpecialCharShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.password("abccc123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutALowerCaseShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.password("AAAAAAA@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutMinNumOfCharShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.password("Ac@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithMultipleSpecCharShouldReturnFalse() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.password("abccc@@@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithProperRequirementsShouldReturnTrue() {

		UserRegistration user = new UserRegistration();
		String actualResult = user.password("Abccc@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}
}
