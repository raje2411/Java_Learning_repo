package java_projects;

public class GalToLitTable {
	public static void main(String args[]) {
		// define input and output variable
		double gallon,liter;
		int counter = 0;

		for (gallon = 1; gallon <= 100; gallon++) {
			liter = gallon * 3.7854;
			System.out.println(gallon + " gallon is " + liter + " liters");
			counter++;
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}

}
