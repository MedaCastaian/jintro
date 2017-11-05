//metoda de sortare a valorilor

package com.edocti.jintro.lab02;

import java.util.*;
public class Demo6 {
    public static void main(String[] args) {
        String myArray[] = new String[4];
        myArray [0] = "Oana ";
        myArray [1] = "Mihai ";
        myArray [2] = "Ana ";
        myArray [3] = "Carmen ";
        Arrays.sort(myArray);
        for (String name: myArray) {
            System.out.print(name);
        }
    }
}
