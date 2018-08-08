package java_projects;
import java.util.Scanner;  //to read strings from command line


public class Switch_with_Strings {

	public Switch_with_Strings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		// Decalaration of variable and initializing the scanner classes
	    Scanner input_scanner = new Scanner(System.in);
	    String input_string;
	    
	    System.out.println("Enter one of the following words to proceed with your transaction:");
	    System.out.println("reject");
	    System.out.println("accept");
	    System.out.println("final");
	    System.out.println("cancel");
	    System.out.print("\nYour input is : ");
	    
		input_string = input_scanner.next();
		input_scanner.close(); //closing the scanner after its use to avoid resource leaks.
		
		switch (input_string) {

		case ("reject"): {
			System.out.println("Your order is rejected as you have requested");
			break;
		}
		case ("final"): {
			System.out.println("Your order is confirmed and finalized");
			break;

		}
		case ("accept"): {
			System.out.println("Your order is requested to accept, will let you know soon :)");
			break;

		}
		case ("cancel"): {
			System.out.println("Your order is cancelled");
			break;
		}
		default :{
			System.out.println("Sorry Invalid input,  enter the correct option next time");
			break;
		}

		}

	}

}
