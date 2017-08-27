package com.edocti.jintro.lab02;
public class FunctionTests1 {
	
    private static int asInt(String input) {
        try {
           int a = Integer.parseInt(args[input]);
        } catch(NumberFormatException e) {
            System.err.println("Not a number: " + input);
            System.exit(-1);
        }
        return int a; 
    }
    
	private static void validateArgs(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java FunctionTests number operator number");
            System.exit(-1);
        }
    }
    
    public static void main(String[] args) {
        validateArgs(args);
        int a = asInt(args[0]);
        String op = args[1].toLowerCase();
        int b = asInt(args[2]);
        int result = -1;
        if (op.equals("+")) {
            result = a + b;
        } else {
            System.err.println("Operation not supported: " + args[1]);
            System.exit(-1);
        }
        System.out.println(result);
    }
} 
	