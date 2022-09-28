/*
 * Replace every "is" with "is not" in a string
 */

package com.nissan.bean;

import java.util.Scanner;

public class ReplaceIsWithIsNot {

	public static void main(String[] args) {
		//Getting input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String ogString = new String(sc.nextLine());
		
		//Using in-built replace function to swap "is" with "is not" 
		String replaceString = ogString.replace(" is "," is not ");
		
		//Output
		System.out.println(replaceString);
		sc.close();
	}

}
