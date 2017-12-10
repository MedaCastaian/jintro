package com.edocti.jintro.lab03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IdentityTest {

	public static void main(String[] args) {
		String text = "Ion, Ionescu, 1801003114230";
		try {
			String firstName = extractFirstName(text);
			String lastName = extractName(text);
			Date birthDate = extractDate(text);
			Sex sex = Sex.parse(text.split(",")[2].trim().substring(0, 1));
			Human p = new Human(firstName, lastName, sex, birthDate);
			System.out.println(p);
		} catch (ParseException e) {
			System.err.println("Error while parsing: " + e.getMessage());
		}
	}

	private static Date extractDate(String text) throws ParseException {
		String cnp = text.split(",")[2].trim();
		return new SimpleDateFormat("yymmdd").parse(cnp.substring(1, 6));
	}

	private static String extractName(String text) {
		return text.split(",")[1].trim();
	}

	private static String extractFirstName(String text) {
		return text.split(",")[0].trim();
	}
}

interface I {
}

enum Sex implements I {
	M, F;

	public static Sex parse(String input) throws ParseException {
		if (input.equals("1") || input.equalsIgnoreCase("M") || input.equalsIgnoreCase("male")) {
			return M;
		}
		if (input.equals("2") || input.equalsIgnoreCase("f") || input.equalsIgnoreCase("female")) {
			return F;
		}
		throw new ParseException("Given input is not parseable", 0);
	}

	private Sex() {
	}
}

class Human {
	private String firstName;
	private String lastName;
	private Sex sex;
	private Date birthDate;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Sex getSex() {
		return sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public Human(String firstName, String lastName, Sex sex, Date date) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.birthDate = date;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName).append(" ").append(lastName).append(" sex: ").append(sex.name()).append(" date: ")
				.append(birthDate);
		return sb.toString();
	}

}
