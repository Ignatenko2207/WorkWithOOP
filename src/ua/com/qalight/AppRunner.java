package ua.com.qalight;

import ua.com.qalight.square.Square;

public class AppRunner {

	public static void main(String[] args) {
		Square square1 = new Square();
		
		square1.someMethod();
		
		square1.setSide(15.5);
		System.out.println("Area of square with side " + square1.getSide() + " is " + square1.getArea());
	}
	
}
