package com.edocti.jintro.lab01;
public class HelloX {
    public static void main(String[] args) { //variabila
        System.out.print("Hello ");
        for (String name: args) {
            System.out.print(name + ", ");
        }
        //System.out.println("Hello " + args[0] + ", " + args[1] + " and " + args[2] + "!");
    }
} 
