package com.edocti.jintro.lab01;
	
public class DemoBoolean{
	public static void main(String[] args){
		boolean isOld=(age > 65);
		int age = Integer.parseInt(args[0]);
		if(isOld){
			System.out.println("You are old!");
		}	
	}
}