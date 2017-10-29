// folosirea metodei equals() intr-un program

package com.edocti.jintro.lab02;

import java.util.*;
public class Demo3 {
    public static void main (String args[]) {
    	int student1Grades [] = new int[3];
    	student1Grades [0] = 90;
    	student1Grades [1] = 70;
    	student1Grades [2] = 80;
    	int student2Grades [] = new int[3];
    	student2Grades [0] = 90;
    	student2Grades [1] = 70;
    	student2Grades [2] = 80;
    	if (Arrays.equals(student1Grades, student2Grades)) {
    		System.out.println("Match");
    	}else
    		System.out.println("No match");
    }
}
