package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Item;

public class ReportGenerator {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the serial number of the product: ");
		int serial = input.nextInt();
		System.out.println("Enter the name of the product: ");
		String name = input.next();
		System.out.println("Enter the price of the product: ");
		float price = input.nextFloat();
		
		Item productOne = new Item(serial,name,price);
		
		productOne.display();
		input.close();
	}

}
