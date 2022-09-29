package com.nissan.app;

import java.util.Scanner;

public class ExceptionOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int empAge;
		
		// Getting input from user
		System.out.println("Enter Employee age: ");
		empAge = input.nextInt();
		
		// Creating object and passing the input
		CheckAge checkAge = new CheckAge(empAge);
		
		// try catch block
		try {			
			checkAge.display();
		}
		catch(AgeException ae) {
			System.out.println("Invalid age!");
		}
		catch(Exception e) {
			System.out.println("Message "+e);
		}
		input.close();
	}

}
