package com.edocti.jintro.lab01;
import static java.lang.System.out;

public class FormatExamples2 {
    
    public static void print(String arg) {
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        
        out.println(a);
        out.println(b);
        
        out.println(a + ", " + b);
        out.printf("%d, %d\n", a, b);
        //out.println("cucu");
        out.printf("%7d, %07d\n", a, b);
        
        out.printf("Hello, %s\n", args[0]);
        
        //out.printf("The number you entered is: %f\n", 10.56f);
        out.printf("The number you entered is: %.2f\n", java.lang.Float.parseFloat(args[1]));
    }
} 
