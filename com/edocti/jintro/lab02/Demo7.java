/*metoda pentru a cauta un element care contine o anumita valoare
  binarySearch() -> elementele trebuie sa fie sortate inainte de a face cautarea
                 -> returneaza o valoare intreaga (nr pozitiv sau negativ)*/

package com.edocti.jintro.lab02;

import java.util.*;
public class Demo7 {
    public static void main(String[] args) {
        int index;
        String myArray[] = new String[4];
        myArray [0] = "Oana ";
        myArray [1] = "Mihai ";
        myArray [2] = "Ana ";
        myArray [3] = "Carmen ";
        Arrays.sort(myArray);
        index = Arrays.binarySearch(myArray, "Ana");
            System.out.println("Ana is in array element: " + index);
    }
}
