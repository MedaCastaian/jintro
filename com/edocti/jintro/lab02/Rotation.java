package com.edocti.jintro.lab02;
public class Rotation {
    
	private static void rotateRight(int[] a, int pos) {
	    if (a == null || a.length <= 1)
			return;
		int N = a.length;
		pos = pos % N;
		//1
		int[] tmp = new int[pos];
		for (int i = 0; i < pos; i++) {
			tmp[i] = a[N - pos + i];
		}
		
		//2
		for (int i = 0; i < N - pos; i++) {
			a[i + pos] = a[i];
		}
		
		//3
		for (int i = 0; i < pos; i++) {
			a[i] = tmp[i];
		}
	}
	
	
	private static void display(int[] x) {
		for (int e: x) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	    int[] y = {5, 30, 10, 4, 7};
		display(y);
		rotateRight(y, 3);
		display(y);
	}
}
