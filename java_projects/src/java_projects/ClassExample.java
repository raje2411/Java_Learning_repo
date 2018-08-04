package java_projects;

class Vehicle {
	double mpg;
	int dist;

	public Vehicle(double m, int d) {
		// TODO Auto-generated constructor stub
		mpg = m * 2; // manipulating the input data mpg & data at object initialization
		dist = d * 2;
	}

	public void Vehicle_method(double m, int d) {
		// TODO Auto-generated constructor stub
		mpg = m * 3; // manipulating the input data mpg & data
		dist = d * 3;
	}

}

public class ClassExample {

	public static void main(String[] args) {

		Vehicle obj_a = new Vehicle(6, 1);
		Vehicle obj_b = new Vehicle(3, 1);

		System.out.println("########################################################################################");
		System.out.println("\nValues before manipulation: \n");
		System.out.println("########################################################################################");

		System.out.println("                                                -----");
		System.out.println("I am accessing Vehicle class variables through obj_a:");
		System.out.println("                                                -----");
		System.out.println("mpg : " + obj_a.mpg);
		System.out.println("dist : " + obj_a.dist + "\n");

		System.out.println("                                                -----");
		System.out.println("I am accessing Vehicle class variables through obj_b:");
		System.out.println("                                                -----");
		System.out.println("mpg : " + obj_b.mpg);
		System.out.println("dist : " + obj_b.dist + "\n");

		obj_a.Vehicle_method(obj_a.mpg, obj_a.dist);
		obj_b.Vehicle_method(obj_b.mpg, obj_b.dist);

		System.out.println("########################################################################################");
		System.out.println("\nValues after calling Vehicle class --> Vehicle_method() to manipulate the data \n");
		System.out.println("########################################################################################");
		System.out.println("                                                -----");
		System.out.println("I am accessing Vehicle class variables through obj_a:");
		System.out.println("                                                -----");
		System.out.println("mpg : " + obj_a.mpg);
		System.out.println("dist : " + obj_a.dist + "\n");

		System.out.println("                                                -----");
		System.out.println("I am accessing Vehicle class variables through obj_b:");
		System.out.println("                                                -----");
		System.out.println("mpg : " + obj_b.mpg);
		System.out.println("dist : " + obj_b.dist + "\n");

	}

}
