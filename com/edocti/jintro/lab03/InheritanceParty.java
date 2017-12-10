package com.edocti.jintro.lab03;

class A {
	protected int a;
	protected int b;

	public A(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("constructor A(a, b) called");
	}

	protected void foo() {
		System.out.println("A.foo()," + a + ", " + b);
	}
}

class B extends A {
	protected int c;

	public void bar() {
		System.out.println("B.bar()," + a + ", " + b + ", " + c);
	}

	public B() {
		super(10, 20);
		c = 10;
	}

	@Override
	public void foo() {
		System.out.println("B.foo()," + a + ", " + b + ", " + c);
	}

}

class D {
}

public class InheritanceParty {
	private static float getF() {
		return 10.23f;
	}

	private static short getS() {
		return 10;
	}

	public static void main(String[] args) {
		A b = new B();
		// b.a = 70;
		// b.b = 80;
		b.foo();

		B b2 = (B) b; // type cast (down cast)
		b2.bar();

		// int i = (int) getF();
		// int i = getF(); // loss of precision => illegal
		int i = getS(); // fara loss of precision => legal
		System.out.println(i);

		// Illegal cast: incompatible
		// D d = new D();
		// B b3 = (B) d;
		// b3.bar();
	}

}
