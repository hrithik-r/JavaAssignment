package com.nissan.app;

public class CheckAge {
	
	// Declaring variable to store from parameter
	int age;

	public CheckAge() {
	}

	public CheckAge(int age) {
		
		// Storing the parameter
		this.age = age;
	}

	public void display() throws AgeException {
		
		// Checking with the condition and throwing exception
		if (age < 18 || age > 60)
			throw new AgeException();
		else
			System.out.println("Your age: " + age);
	}
}
