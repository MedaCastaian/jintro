package com.edocti.jintro.lab02;
public class FibonacciExample {
    
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
	
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
} 
