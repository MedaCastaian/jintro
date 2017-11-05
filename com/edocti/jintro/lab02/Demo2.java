//o metoda care trebuie sa returneze o matrice catre instructiunea carea apelat-o

package com.edocti.jintro.lab02;

public class Demo2 {
	public static void main(String[] args) {
	    float rawTest[];
	    rawTest = testData();
	    System.out.println("Correction Answers: " + rawTest[0]);
	    System.out.println("Total Questions: " + rawTest[1]);
	}
	private static float[] testData() {
	    float rawTest[] = {70, 100};
	    return rawTest;
	}
}
