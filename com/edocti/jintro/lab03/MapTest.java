package com.edocti.jintro.lab03;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

class Student2 {
	private String firstname;
	private String lastname;

	public Student2(String f, String t) {
		firstname = f;
		lastname = t;

	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname;
	}
}

public class MapTest {
	public static void main(String[] args) {
		// start
		Integer i1 = new Integer(10);
		Integer i2 = 10;
		int i3 = i1;
		// end
		Map<Student2, Integer> mathMarks = new HashMap<>();
		Student2 ionIonescu = new Student2("Ion", "Ionescu");
		Student2 anaIonescu = new Student2("Ana", "Ionescu");

		mathMarks.put(ionIonescu, 10);
		mathMarks.put(anaIonescu, 10);
		mathMarks.put(new Student2("Ionel", "Popescu"), 9);

		out.printf("%s's marks is %d\n", ionIonescu, mathMarks.get(ionIonescu));

		for (Student2 s : mathMarks.keySet()) {
			out.printf("%s's marks is %d\n", s, mathMarks.get(s));

			for (int mark : mathMarks.values()) {
				out.println(mark);
			}
		}

		Map<String, Double> weight = new HashMap<>();
		String oanaPopescu = new String("Oana Popescu");
		String alin = "Alin";

		weight.put(oanaPopescu, 60.0);
		weight.put("Alin", 90.2);
		for (String s : weight.keySet()) {
			out.printf("%s's weight is %.02f\n", s, weight.get(s));

		}
	}
}
