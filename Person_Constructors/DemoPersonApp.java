package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Person;

public class DemoPersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Enter your salary: ");
		float salary = input.nextFloat();
		
		Person details = new Person(name,age,salary);
		
		details.display();
		input.close();
	}

}
