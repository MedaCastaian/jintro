package com.edocti.jintro.lab01;
public class DoubleOperations{
	public static void main(String... args){
		double a = Double.parseDouble(args[0]);
		a = Math.toRadians(a);
		System.out.println("Math.sin(" + a + ") = " + Math.sin(a));
	}
} 
