/*
 * Calculate sum of digits from a string
 */

package com.nissan.bean;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		//Getting input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String inputNum = sc.next();
		
		//Declaring and initializing sum variable
		int sumDigits = 0;
		for (int i = 0; i < inputNum.length(); i++) {
			
			//Using in-built getNumericValue function from character position
			int currentDigit = Character.getNumericValue(inputNum.charAt(i));
			sumDigits += currentDigit;
		}
		System.out.println(sumDigits);
		sc.close();
	}
	
}
