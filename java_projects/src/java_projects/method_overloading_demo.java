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
		System.out.println("Show_var(String) method is used to print the input variable " + input);
	}
}

public class method_overloading_demo {

	public static void main(String args[]) {

		overloadclass obj = new overloadclass();

		// passing int variable to the method show_var
		obj.show_var(123);
		
		// passing char variable to the method show_var
		obj.show_var('R');
		
		// passing char  as String with " " to the method show_var
		obj.show_var("R");
		
		// passing int variable to the method show_var
		obj.show_var(123.232);
		
		// passing int variable to the method show_var
		obj.show_var("rajesh has created this program ");

		
	}

}
