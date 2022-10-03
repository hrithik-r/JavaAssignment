package com.nissan.dao;

import java.util.Scanner;
import com.nissan.bean.Bank;

public class BankDao {
	static int i = 0;
	static Scanner input = new Scanner(System.in);
	public static void menu() {
		
		// Scanner
		char choice = 'n';
		do {
			System.out.println("1. Add a new customer\n2. Update customer detail\n"
					+ "3. Delete a customer\n4. Deposit money\n5. Withdraw money\n"
					+ "6. Show balance\n7. Display all customers\n"
					+ "8. Display a specific customer\n9. Transfer funds");
			System.out.print("Enter your choice: ");
			int option = input.nextInt();
			switch(option) {
			case 1:
				addCustomer();
				break;
			case 2:
				updateCustomer();
				break;
			case 3:
				delCustomer();
				break;
			case 4:
				deposit();
				break;
			case 5:
				withdraw();
				break;
			case 6:
				showBalance();
				break;
			case 7:
				displayAllCust();
				break;
			case 8:
				displaySpecificCust();
				break;
			case 9:
				transferFunds();
				break;
			case 10:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Enter a valid option!");
				choice = 'y';
				break;
			}
			
		}while(choice == 'y'||choice=='Y');
	}

	private static void transferFunds() {
		// TODO Auto-generated method stub
		
	}

	private static void displaySpecificCust() {
		// Created object
		Bank bank = new Bank();
		
		// Loop element to repeat do while if the customer is not found or to exit
		char choice = 'n';
		do {
			System.out.println("Enter the account number of customer you want to view: ");
			long accNum = input.nextLong();
			if (bank.checkCustomer(accNum)) {
				// Calling method in bean class
				bank.custDetails();
			} else {
				System.out.println("Cannot find the customer");
				System.out.println("Do you want to search again? (y/n)");
				choice = input.next().charAt(0);
			}
		} while (choice == 'y');
		
	}

	private static void displayAllCust() {
		// Object intialised
		Bank bank = new Bank();
		System.out.println(bank.getAccNumber());
		System.out.println(bank.getCustName());
		System.out.println(bank.getAccType());
		System.out.println(bank.getBalance());
		System.out.println(bank.getMinBalance());
		System.out.println(bank.getMobNumber());
		System.out.println(bank.getEmailId());
	}

	private static void showBalance() {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		
	}

	private static void delCustomer() {
		// Created object
		Bank bank = new Bank();
		System.out.println("Enter the account number of customer to delete: ");
				
		// Getting input
		long accNum = input.nextLong();
		if(bank.checkCustomer(accNum)==true) {
			bank.deleteCust();
		}
		else
			System.out.println("Customer not found!");
		menu();
	}

	private static void updateCustomer() {
		// Created object
		Bank bank = new Bank();
		char choice = 'n';
		try {
			do {
				System.out.println("Enter the account number of customer to update: ");
				// Getting input
				long accNum = input.nextLong();
				// if condition calling method for return value
				if (bank.checkCustomer(accNum) == true) {
					System.out.println("Enter new e-mail id: ");
					bank.updateEmail(input.next());
					System.out.println("Enter new mobile number: ");
					bank.updatePhone(input.nextLong());
				} else {
					// If the account not found
					System.out.println("Account not found, returning to main menu...");
					menu();
				} 
			} while (choice == 'y' || choice == 'Y');
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void addCustomer() {
		// Object
		Bank bank = new Bank();
		
		// Getting inputs and generating account number, PIN
		bank.setAccNumber();
		System.out.println("Enter customer name: ");
		bank.setCustName(input.next());
		int x = 0;
		try {
			do {
				System.out.println("Enter account type: (Savings/Current)");
				String accountType = input.next();
				if (accountType.equalsIgnoreCase("savings"))
					bank.setAccType(accountType);
				else if (accountType.equalsIgnoreCase("current"))
					bank.setAccType(accountType);
				else {
					System.out.println("Invalid type");
					x = 1;
				}
			} while (x == 1);
			System.out.println("Enter the balance amount: ");
			bank.setBalance(input.nextDouble());
			System.out.println("Enter the minimum balance: ");
			bank.setMinBalance(input.nextDouble());
			System.out.println("Enter 10-digit mobile number: ");
			bank.setMobNumber(input.nextLong());
			System.out.println("Enter the e-mail id: ");
			bank.setEmailId(input.next());
			bank.setAtmPin();
			System.out.println(bank.getAccNumber());
			
			// Custom method calling
			bank.incrementPointer();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Returning to menu
		menu();
	}

}
