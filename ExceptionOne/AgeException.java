package com.nissan.app;

// Creating a child class from Exception parent class
@SuppressWarnings("serial")
public class AgeException extends Exception{
	
	// Constructor
	public AgeException() {
		System.out.println("From User-defined Exception");
	}
}
