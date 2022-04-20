package com.bridgelabz.userregwithlamda;

@FunctionalInterface
public interface IUserRegistration {

	 boolean validate(String value) throws UserRegistrationException;
}
