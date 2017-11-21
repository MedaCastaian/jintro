package com.edocti.jintro.lab03;

public class Person {
	private String name;
	private String surname;
	private int age;
	public static int MAX_AGE = 200;

	// constructor
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public Person() {
		age = 0;
		name = "";
		surname = "";
	}

	public void increaseAge() {
		age++;
	}

	public void eat() {
		System.out.println(name + " is eating");
	}

	public static void cucu() {
		System.out.println("Cucu!");
		System.out.println("Max age = " + MAX_AGE);
	}

	public static int getMaxAge() {
		return MAX_AGE;
	}

	public static void main(String[] args) {
		Person ion = new Person("Ion", "Ionescu", 30);
		Person george = new Person("George", "Georgescu", 25);
		Person mihai = new Person("Mihai", "Viteazul", 50);

		System.out.println(ion);

		ion.increaseAge();
		ion.increaseAge();
		ion.eat();

		Person.cucu();
	}
}
