package com.edocti.jintro.lab01;
public class Operators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i + " >>> 2 = " + (i >>> 2));
        System.out.println(i + " << 2 = " + (i << 2));
        System.out.println((i + 1) + " << 2 =" + (++i << 2)); 
        System.out.println(i + " << 1 =" + (i++ << 1));
        System.out.format("i = %d\n", i);
        }
} 
