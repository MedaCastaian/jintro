package com.edocti.jintro.lab01;
public class HelloArrays {
    
	private static void arrayTests1(String[] args) {
        if (args == null || args.length == 0) {
            return;
        }
        System.out.print("Hello ");
        for (int i = 0; i < args.length - 1; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println(args[args.length -1]);
    }
    
	private static void arrayTests2(String[] args) {
        if (args == null || args.length == 0) {
            return;
        }
        String greet = "Hello ";
        int n = args.length - 1;
        for (int i = 0; i < n; i++) {
            //greet = greet + args[i] + ", ";
            greet += args[i] + ", ";
        }
        greet = greet + args[n];
        System.out.println(greet);
    }
    
	private static void arrayTests3() {
        String[] names = {"Ana", "Ion", "Oana", "Alex"};
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }
        for (String name: names)
            System.out.println(name);
    }
    
	public static void main(String[] args) { //variabila
        arrayTests2(args);
        arrayTests3();
    }
} 
