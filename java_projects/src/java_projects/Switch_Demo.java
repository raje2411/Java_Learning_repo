package java_projects;

public class Switch_Demo {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			switch (i) {
			case 0:
				System.out.println("I is Zero");
				break; // If no break, then the next case will be executed. so break is must
			case 1:
				System.out.println("I is One");
				break;
			case 2:
				System.out.println("I is Two");
				break;
			case 3:
				System.out.println("I is Three");
				break;
			case 4:
				System.out.println("I is Four");
				break;
			default:
				System.out.println("I is greater than 5 or more" + i);
				break;

			}
		}

	}

}
