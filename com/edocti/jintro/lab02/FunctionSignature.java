package com.edocti.jintro.lab02;

import java.util.Scanner;

public class FunctionSignature {

	// 1. O functie care calculeaza suma elementelor unui array de numere
	// intregi
	public static int sum(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i]; // sum = sum + a[i];
			return sum;
		}
	}

	// 2. O functie care returneaza cel mai mic element dintr-un array de numere
	// intregi
	public static int findMin(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	// 3. O functie care returneaza cel mai scurt element dintr-un array de
	// String-uri
	public static String findShortest(String[] a) {
		if (a == null || a.length == 0) {
			return "";
		}
		String shortest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i].length() < shortest.length()) {
				shortest = a[i];
			}
		}
		return shortest;
	}

	// 4. O functie care calculeaza valoarea medie dintr-un array de numere
	// reale reprezentabile pe 64 de biti.
	public static double avg(double[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}

		double res = 0;
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i]; // sum = sum + a[i];
		}
		return res = sum / a.length;
	}

	// 5. O functie care calculeaza valoarea medie dintr-un array de numere
	// reale reprezentabile pe 32 de biti.
	public static float avg(float[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		float res = 0;
		float sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i]; // sum = sum + a[i];
		}
		return res = sum / a.length;
	}

	// 6. O functie care aduna cu 10 fiecare element al unui array de numere
	// reale pe 64 de biti
	public static void addTen(double[] a) {
		if (a == null || a.length == 0) {
			return;
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + 10;
		}
	}

	// 7. O functie care aduna cu un numar intreg dat fiecare element al unui
	// array de numere reale pe 32 de biti
	public static void addNumber(int[] a, int number) {
		if (a == null || a.length == 0) {
			return;
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + number;
		}
	}

	// 8. O functie care, pentru un array de numere intregi, returneaza un array
	// in care fiecare element reprezinta dublul elementului corespunzator din
	// array-ul de intrare
	public static int[] doubleUp(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * 2;
		}
		return a;
	}

	// 9. O functie care afiseaza elementele unui array in ordine inversa
	public static void displayReverse(String[] a) {
		if (a == null || a.length <= 1) {
			return;
		}
		Scanner input = new Scanner(System.in);
		String word = input.next();
		String reverse = " ";
		for (int i = word.length() - 1; i >= 0; i--)
			reverse += word.charAt(i);
		// The charAt() method returns the character at the specified index in a
		// string.
		// The index of the first character is 0, the second character is 1, and
		// so on.
		// The index of the last character in a string is string.length-1, the
		// second last character is string.length-2, and so on
		System.out.println(reverse);
	}

	// 10. O functie care afiseaza elementele unui array in ordine naturala, dar
	// din doi in doi
	public static void sortByTwo(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// 11. O functie care sorteaza un array de numere intregi reprezentate pe 64
	// de biti
	public static void sort(double[] a) {
		double n = a.length;
		double temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					// swap the elements
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	// 12. O functie care sorteaza un array de numere intregi reprezentate pe 16
	// biti
	public static void sort(short[] a) {
	//the same as in the previous exercise
    }
