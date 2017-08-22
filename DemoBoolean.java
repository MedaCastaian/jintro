package com.edocti.jintro.lab01;
public class DemoBoolean {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		boolean isOld = age > OLD_AGE;
		if (isOld) {
			System.out.println("You are old!");
		} 
	} 
	private static final int OLD_AGE = 65;
} 
