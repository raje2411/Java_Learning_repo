package java_projects;

class static_var_class {
	static int x = 10; // This is a global variable which affects all instances( any obj) of this class
	int y; // normal instance variable

	int sum(int y) {
		return x + y;
	}
	
	static int square_of_num(int z) {
		z = z * z;
		return z;
	}

}

public class Static_variable_and_methods_demo {

	public static void main(String[] args) {

		static_var_class obja = new static_var_class();
		static_var_class objb = new static_var_class();
		obja.y = 100;
		objb.y = 20;
		System.out.println("Sum of x(" + static_var_class.x + ") and y(" + obja.y + ") is : " + obja.sum(obja.y));
		System.out.println("Sum of x(" + static_var_class.x + ") and y(" + objb.y + ") is : " + obja.sum(objb.y));

		// I will alter the static variable x through its class, and will see it affects
		// the objb object as well obja object

		// you can see the static variable is referd using it's class name instead of
		// object name.
		// same is true for static methods as well.
		static_var_class.x = 11;
		System.out.println("\n\nAfter static variable change:\n\n");
		System.out.println("Sum of x(" + static_var_class.x + ") and y(" + obja.y + ") is : " + obja.sum(obja.y));
		System.out.println("Sum of x(" + static_var_class.x + ") and y(" + objb.y + ") is : " + obja.sum(objb.y));
		
		System.out.println("\n\n");
		
		//squrare method using static , not using objects to access the static methods.
		System.out.println("Square of obja.y "+static_var_class.square_of_num(obja.y));
		System.out.println("Square of objb.y "+static_var_class.square_of_num(objb.y));
	}

}
