//metoda pentru a atribui valoarea zero fiecarui element

package com.edocti.jintro.lab02;

import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        int studentIDs[] = new int [50];
        Arrays.fill(studentIDs, 1);
        for(int i = 0; i < studentIDs.length; i++) {
            System.out.print(studentIDs [i]);
        }	
    }	
}
