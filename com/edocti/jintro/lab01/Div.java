package com.edocti.jintro.lab01;
public class Div { 
        inf (args.length < 2) {
            System.err.println("Usage: java com.edocti.jintro.lab01.Div n1 n2");
            System.exit(-1);
        }
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double div  = a / b;
        System.out.println(a + " / " + b + " = " + div);
    }
} 
