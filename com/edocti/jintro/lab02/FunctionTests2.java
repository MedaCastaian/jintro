package com.edocti.jintro.lab02;
public class FunctionTests2 {

    private static double average(double[] x) {
        if (x == null || x.length == 0) {
            return 0;
        }
        
    double res = 0;
    double sum = 0;
        for (int i = 0; i < x.length; i++) {
           sum += x[i]; //sum = sum + x[i]; 
        }
            return res = sum /x.length;
    }
    
    private static void swap (int a, int b) {
    System.out.printf("x=%d, y=%d\n", a, b);
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("x=%d, y=%d\n", a, b);
    }
    
    public static void main(String[] args) {
    double[] arr = {2.1, 1.3, 7, 8, 10, 12.6};
    double avg = average(arr);
    System.out.println(avg);
        
    int x = 10, y = 20;
    System.out.printf("x=%d, y=%d\n", x, y);
    swap (x, y);
    System.out.printf("x=%d, y=%d\n", x, y);
    }
} 
