package com.nissan.app;

import com.nissan.dao.BankDao;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("\t\tWelcome to W Bank");
		
		// Calling method in DAO
		BankDao.menu();
		System.out.println("Thank you for using the app!");
	}

}
