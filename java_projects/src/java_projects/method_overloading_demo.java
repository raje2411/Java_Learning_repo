package java_projects;

class overloadclass {

	void show_var(int input) {
		System.out.println("Show_var(int) method is used to print the input variable " + input);
	}

	void show_var(char input) {
		System.out.println("Show_var(char) method is used to print the input variable " + input);
	}

	void show_var(double input) {
		System.out.println("Show_var(double) method is used to print the input variable " + input);
	}

	void show_var(String input) {
		System.out.println("Show_var(int) method is used to print the input variable " + input);
	}
}

public class method_overloading_demo {

	public method_overloading_demo() {

		overloadclass obj = new overloadclass();

		// passing int variable to the method show_var
		obj.show_var(123);
	}

}
