/*
 * Enter the marks of 10 students and find out the average
 */

package com.nissan.bean;

import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		
		//Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks for 10 students: ");
		
		//Declaring an integer array
		int[] marks = new int[10];
		
		//Using for loop to get 10 inputs
		for (int i = 0; i < 10; i++) {
			marks[i] = sc.nextInt();
		}
		int avg = 0;
		for (int i = 0; i < 10; i++) {
			avg = avg+marks[i];
		}
		
		//Output
		System.out.println("Average marks of 10 students: "+avg);
		sc.close();
	}

}
