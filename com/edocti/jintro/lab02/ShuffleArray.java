package com.edocti.jintro.lab02;
import java.lang.Math;
public class ShuffleArray {
	
    private static void shuffleArray(int[] a) {
        int N = a.length;
        // between i and N-1
        for (int i = 0; i < N; i++) {
            int r = (int) (N * Math.random());
        int tmp = a[i];    // swap
        a[i] = a[r];
        a[r] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 4, 20, 10, 6, 7, 9};
        shuffleArray(a);
        for (int i: a) {
            System.out.print(i + " ");
        }
    }
} 
