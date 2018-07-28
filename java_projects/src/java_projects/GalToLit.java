package java_projects;

import java.util.Scanner;

public class GalToLit {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double converted_liters;
		// input_gallons=5;
		System.out.println("Enter the number of gallons to be converted");
		double input_gallons = scanner.nextDouble();
		converted_liters = input_gallons * 3.7854;
		System.out.println(input_gallons + " Gallon is equal to " + converted_liters + " Liters");
		scanner.close();
	}

}
