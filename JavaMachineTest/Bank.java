package com.nissan.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
	// Instance variables
	static int i = 0; // Global index pointer
	static int update = 0; // Updation pointer
	List<Long> accNumber = new ArrayList<Long>();
	List<String> custName = new ArrayList<String>();
	List<String> accType = new ArrayList<String>();
	List<Double> balance = new ArrayList<Double>();
	List<Double> minBalance = new ArrayList<Double>();
	List<Long> mobNumber = new ArrayList<Long>();
	List<String> emailId = new ArrayList<String>();
	List<Integer> atmPin = new ArrayList<Integer>();

	// Default constructor
	public Bank() {
		super();
	}

	/*
	 * public Bank(List<Long> accNumber, List<String> custName, List<String>
	 * accType, List<Integer> minBalance, List<Long> mobNumber, List<String>
	 * emailId, List<Integer> atmPin) { super(); this.accNumber = accNumber;
	 * this.custName = custName; this.accType = accType; this.minBalance =
	 * minBalance; this.mobNumber = mobNumber; this.emailId = emailId; this.atmPin =
	 * atmPin; }
	 */

	public List<Long> getAccNumber() {
		return accNumber;
	}

	public void setAccNumber() {
		this.accNumber.add(generateAccNumber());
	}

	public List<String> getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName.add(custName);
	}

	public List<String> getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType.add(accType);
	}

	public List<Double> getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance.add(balance);
	}

	public List<Double> getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance.add(minBalance);
	}

	public List<Long> getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber.add(mobNumber);
	}

	public List<String> getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId.add(emailId);
	}

	public List<Integer> getAtmPin() {
		return atmPin;
	}

	public void setAtmPin() {
		this.atmPin.add(generateATMPin());
	}

	public long generateAccNumber() {
		Random random = new Random();
		return 100000000 + random.nextInt(900000000);
	}

	public int generateATMPin() {
		Random random = new Random();
		return 1000 + random.nextInt(9000);
	}

	public void incrementPointer() {
		i++;
	}

	public void decrementPointer() {
		i--;
	}

	public boolean checkCustomer(long accNum) {
		for (int j = 0; j < accNumber.size(); j++) {
			if(accNumber.get(j).equals(accNum)) {
				update = j;
				return true;
			}
		}
		return false;
	}

	public void updateEmail(String email) {
		// TODO Auto-generated method stub
		emailId.set(update, email);
	}

	public void updatePhone(long phone) {
		// TODO Auto-generated method stub
		mobNumber.set(update, phone);
	}

	public void custDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+custName.get(update));
		System.out.println("Account type: "+accType.get(update));
		System.out.println("Balance: "+balance.get(update));
		System.out.println("Minimum Balance: "+minBalance.get(update));
		System.out.println("Mobile Number: "+mobNumber.get(update));
		System.out.println("E-mail ID: "+emailId.get(update));
	}

	public void deleteCust() {
		accNumber.remove(update);
		custName.remove(update);
		accType.remove(update);
		balance.remove(update);
		minBalance.remove(update);
		mobNumber.remove(update);
		emailId.remove(update);
		atmPin.remove(update);
	}

	
}
