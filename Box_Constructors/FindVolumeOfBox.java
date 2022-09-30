package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Box;

public class FindVolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height: ");
		int height = input.nextInt();
		System.out.println("Enter the width: ");
		int width = input.nextInt();
		System.out.println("Enter the depth: ");
		int depth = input.nextInt();
		
		Box volume = new Box(height,width,depth);
		
		volume.volume();
		
		System.out.println(volume.toString());
		input.close();
	}

}
