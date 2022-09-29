package com.nissan.app;

public class ExceptionTwo {

	public static void main(String[] args) {
		try {
			int[] tenElements = new int[10];
			System.out.println(tenElements[11]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index is out of bound!");
		}
	}

}
