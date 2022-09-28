package com.nissan.app;

import java.util.Scanner;

public class ATM {

	// Scanner class
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char choice = 'n';
		char choiceMain = 'n';
		double accBalance = 0;
		double minBalance = 5000;
		int PIN = 1111;
		System.out.println("\0\0\0Welcome to XYZ Bank ATM\0\0\0");
		
		// Do while loop and switch case for menu driven console
		do {
			System.out.println("Enter your PIN to continue:");
			if (PIN == input.nextInt()) {
				do {
					
					// Getting option input
					System.out.println("1. Deposit\n2. Withdraw\n3. Show balance\n4. Exit\nEnter your choice:");
					int option = input.nextInt();
					switch (option) {
					case 1:
						accBalance = deposit(accBalance);
						System.out.println("Your new balance is " + accBalance + " Rupees");
						break;
					case 2:
						accBalance = withdraw(accBalance, minBalance);
						System.out.println("Your new balance is " + accBalance + " Rupees");
						break;
					case 3:
						showBalance(accBalance);
						break;
					case 4:
						System.out.println("Exiting...");
						System.exit(0);
					default:
						System.out.println("Enter a valid option!");
					}

					// Asking user to continue the loop or not
					System.out.println("Do you want to go to main menu or exit(y/n):");
					choice = input.next().charAt(0);
				} while (choice == 'y' || choice == 'Y');
			} else {
				System.out.println("Wrong PIN!!!");
				choice = 'y';
			}
		}while(choiceMain=='y'||choiceMain=='Y');

	}

	private static void showBalance(double accBalance) {

		// Retrieving the account balance from main and showing output
		System.out.println("Your account balance is " + accBalance + " Rupees");
	}

	private static double withdraw(double accBalance, double minBalance) {
		// Getting Withdraw amount from user
		System.out.print("Enter the amount you want to withdraw from you account: ");
		double amtWithdraw = input.nextDouble();

		// Checking if the withdraw amount is greater than the available amount from
		// minimum balance
		if (amtWithdraw > (accBalance - minBalance)) {
			System.out.println("Insufficient Funds..!!!");
			return accBalance;
		} else {
			System.out.println("Plz collect your cash...");
			return accBalance - amtWithdraw;
		}

	}

	private static double deposit(double accBalance) {

		// Getting deposit amount from user
		char choice = 'n';
		double amtDeposit = 0;
		do {
			System.out.print("Enter the amount you want to deposit: ");
			amtDeposit = input.nextDouble();
			if (amtDeposit > 0) {
				System.out.println("You want to deposit " + amtDeposit
						+ " Rupees to your account\nTo continue press 'y' or to enter again press 'n'");
				choice = input.next().charAt(0);
			} else {
				System.out.println("Enter a valid amount to deposit");
				choice = 'n';
			}
		} while (choice == 'n');
		return accBalance + amtDeposit;
	}

}
