package java_projects;

public class ifDemo {
	public static void main(String args[]) {
		int a, b, c;
		a = 2;
		b = 1;

		if (a < b) {
			System.out.println("a is less than b");
		}
	
		if (a == b) {
			System.out.println("I wont see this message");
		}

		c = a - b; // c is -1
		if (c > 0) {
			System.out.println("C is non-negative");
		}
		if (c < 0) {
			System.out.println("C is NEGATIVE");
		}

		c = b - a; // c is +1

		if (c > 0) {
			System.out.println("C is now non-negative");
		}
		if (c < 0) {
			System.out.println("C is now NEGATIVE");
		}

	}

}
