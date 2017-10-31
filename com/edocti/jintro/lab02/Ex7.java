package com.edocti.jintro.lab02;

import java.util.*;
import java.text.*;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	double payment = scanner.nextDouble();
	scanner.close();
        
        String us = NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment).toString();
	String china = NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment).toString();
        String france =NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment).toString();
	    
	System.out.println("US: " + us);
	System.out.println("China: " + china);
	System.out.println("France: " + france);
    } 
}
