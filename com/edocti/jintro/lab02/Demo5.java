//metoda pentru a reinitializa cu o valoare data numai un anumit interval de elemente

package com.edocti.jintro.lab02;

import java.util.*;
public class Demo5 {
    public static void main(String[] args) {
        float studentIDs[] = new float [50];
        Arrays.fill(studentIDs, 1);
        for(int i = 0; i < studentIDs.length; i++) {
            System.out.print(studentIDs [i]);
        }
        Arrays.fill(studentIDs, 20, 31, 0);
        for(int i = 0; i < studentIDs.length; i++) {
            System.out.print(studentIDs [i]);
        }
    }
}
