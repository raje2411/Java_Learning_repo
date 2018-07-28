package java_projects;

public class gravity {
	public static void main(String args[]) {
		int moon_gravity = 17;
		double weight_earth = 75;
		double weight_at_moon = (weight_earth * moon_gravity) / 100;
		System.out.println("My earth weight " + weight_earth + "kg is equal to " + weight_at_moon + " kg at moon");

	}

}
