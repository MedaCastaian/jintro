package com.edocti.jintro.lab01;
public class Div { 
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double div  = a / b;
        System.out.println(a + " / " + b + " = " + div);
    }
} 
