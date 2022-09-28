package com.nissan.bean;

public class Customer {

	public static boolean checkCustomerExists(String customerName, String[] customerNames) {

		// Check condition
		for (String customer : customerNames) {
			if (customerName.equals(customer))
				return true;
		}
		return false;
	}

}
