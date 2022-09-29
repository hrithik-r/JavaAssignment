package com.nissan.app;

import java.util.Scanner;
import com.nissan.bean.Customer;

public class BankApp {

	public static void main(String[] args) {

		// Declare variables
		Scanner input = new Scanner(System.in);

		// Get input from the user
		String[] customerNames = new String[20];
		double[] openingBalance = new double[20];

		// Choice
		char choice = 'n';
		String enterCustomerName = "";
		int counter = 0;

		// Menu driven
		do {
			System.out.println("Enter customer name: ");
			enterCustomerName = input.nextLine();

			if (Customer.checkCustomerExists(enterCustomerName, customerNames)) {
				System.out.println("Customer already exists!!");
				continue;
			} else
				customerNames[counter] = enterCustomerName;

			// Other details
			System.out.println("Enter opening balance:");
			openingBalance[counter] = Double.parseDouble(input.nextLine());
			counter++;

			// To continue or exit
			System.out.println("To continue press 'y' or to exit press 'n'");
			choice = input.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
	}

}
