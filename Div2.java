package com.edocti.jintro.lab01;
public class Div2 {
	public static void main(String[] args) {
		double a, b, c;
		a = 20;
		b = 0;
		c = 10;
		int x, y;
		x = 20;
		y=0;
		System.out.println(a/b); //Infinty
		System.out.println(a/b - c/b); //NaN
		System.out.println((a/b - c/b) * 200); //NaN
		System.out.println((int)((a/b - c/b) * 200)); //cand fac cast la int, NaN (care este o valoare speciala Float) este transformat in zero no matter what
		System.out.println(x/y); //Ultima linie da Division by zero (ArithmeticException), pentru ca numerele nu mai sunt float, ci int. Aici nu avem aceleasi reguli ca si la float. Daca imparti un intreg la zero, programul va crapa.
	}
}