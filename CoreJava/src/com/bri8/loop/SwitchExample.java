package com.bri8.loop;

public class SwitchExample {

	public static void main(String[] args) {

		int dayOfWeek = 1;
		String dayName;
		switch (dayOfWeek) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		// Add more cases for other days
		default:
			dayName = "Invalid day";
		}
		System.out.println("Day of the week: " + dayName);

	}

}
