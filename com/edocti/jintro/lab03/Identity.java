/*Cunoscand datele despre o persoana date ca si string, transformati acest string intr-un obiect de tip Person->Identity:

"Ion, Popescu, 1800920117892" - ultimul token este CNP-ul, cu regulile cunoscute:
daca prima cifra este 1 => barbat, 2 => femeie
80 => nascut in 1980
09 => luna 09 (Sept)
20 => ziua 20
restul cifrelor nu au importanta pentru noi*/

package com.edocti.jintro.lab03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Identity {
	private String name;
	private String surname;
	private String IDno;
	private String Gender;
	private Date birthdate;

	public static void main(String[] args) {
		String identity = "Ion, Popescu, 1800920117892";
		Identity a = extractIdentity(identity);
		String Gender = extractGender(identity);
		Date birthdate = extractbirthdate(identity);
		System.out.println(a);
		System.out.println(Gender);
		System.out.println(birthdate);
	}

	private static Identity extractIdentity(String identity) {
		String[] tokens = identity.split(",");
		String name = tokens[0].trim();
		String surname = tokens[1].trim();
		String IDno = tokens[2].trim();
		return new Identity(name, surname, IDno);
	}

	private static String extractGender(String IDno) {
		int g = Integer.parseInt(IDno.substring(0));
		String Male = "1", Female = "2";
		if (g == 1) {
			return Male;
		} else {
			return Female;
		}
	}

	private static Date extractbirthdate(String IDno) {
		int b = Integer.parseInt(IDno.substring(1, 6));
		try {
			Date birthdate = new SimpleDateFormat("yymmdd").parse("birthdate");
		} catch (ParseException e) {
			System.err.println("The given String is not a date");
		}
		return birthdate;
	}

	@Override
	public String toString() {
		return name + " " + surname + " " + "Gender" + "birthdate";
	}

	public Identity(String name, String surname, String IDno) {
		super();
		this.name = name;
		this.surname = surname;
		this.IDno = IDno;
	}

	public Identity(String Gender, Date birthdate) {
		this.Gender = Gender;
		this.birthdate = birthdate;
	}

}
