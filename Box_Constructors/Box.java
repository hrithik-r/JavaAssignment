package com.nissan.bean;

public class Box {
	// Instance variables
	private int height;
	private int width;
	private int depth;
	
	public Box() {
	}
	
	public Box(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public void volume() {
		System.out.println("The volume is "+height*width*depth);
	}

	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", depth=" + depth + "]";
	}
	
}
