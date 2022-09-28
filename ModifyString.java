/*
 * Read a string and return after removing # and its immediate
 * left and right characters
 */

package com.nissan.bean;

import java.util.Scanner;

public class ModifyString {

	public static void main(String[] args) {

		// Getting input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = new String(input.nextLine());

		char[] strToChar = new char[inputString.length()];

		// Using for loop to traverse and copy it to char array
		for (int i = 0; i < inputString.length(); i++) {
			strToChar[i] = inputString.charAt(i);
		}

		// For loop to find and delete the characters
		for (int i = 0; i < inputString.length(); i++) {
			if (strToChar[i] == '#') {
				if (i == 0) {
					strToChar[i] = '\0';
					strToChar[i + 1] = '\0';
				} else if (i == inputString.length() - 1) {
					strToChar[i] = '\0';
					strToChar[i - 1] = '\0';
				} else {
					strToChar[i] = '\0';
					strToChar[i + 1] = '\0';
					strToChar[i - 1] = '\0';
				}
			}
		}
		
		// Output
		System.out.println("Modified string is ");
		
		//Declaring and initializing empty string to save output
		String modString = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (strToChar[i] != '\0') {
				modString += strToChar[i];
			}
		}
		System.out.print(modString);
		input.close();
	}

}
