// metoda care calculeaza o nota in functie de nr de raspunsuri corecte la intrebarile dintr-un test

package com.edocti.jintro.lab02;

public class Demo1 {
    public static void main(String[] args) {
    	float grade;
    	float rawTest[] = {70, 100};
    	grade = gradeCalc(rawTest);
    	System.out.println("Your grade is: " + grade);
    }
    private static float calculateGrade(float test[]) {
    	return (test[0]/test[1]) * 100;
    }  
}
