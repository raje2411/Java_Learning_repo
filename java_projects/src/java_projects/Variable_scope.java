package java_projects;

public class Variable_scope {

	public static void main(String args[]) {
		int x = 10;

		if (x == 10) {
			int y = 20;
			System.out.println("Print x:" + x + " and y: " + y);
			x = y * x;
			System.out.println("Print x*y =:" + x);

		}
		System.out.println("Printing x outside of if block x:" + x);
		// System.out.println("Print y outside of if block y:"+y); - It fails with
		// compilation error, as expected we can't access Y outside of the if{ } block
	}
}
