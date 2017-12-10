//Mercedes, C200, green, 5

package com.edocti.jintro.lab03;

public class Car {
	private String manufacturer;
	private String model;
	private String color;
	private int doors;

	public static void main(String[] args) {
		String car = "Mercedes, C200, green, 5";
		Car c = extractCar(car);
		System.out.println(c);
	}

	private static Car extractCar(String car) {
		String[] tokens = car.split(",");
		int doors = Integer.parseInt(tokens[3].trim());
		String manufacturer = tokens[0].trim();
		String model = tokens[1].trim();
		String color = tokens[2].trim();
		return new Car(manufacturer, model, color, doors);
	}

	@Override
	public String toString() {
		return manufacturer + " " + model;
	}

	public Car(String manufacturer, String model, String color, int doors) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
		this.doors = doors;
	}
}
