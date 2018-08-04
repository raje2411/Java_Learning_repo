package java_projects;

public class Guess_Game {

	public static void main(String[] args) throws java.io.IOException, InterruptedException {

		char input_ch, answer = 'H';

		System.out.println("Welcome to the Guess game ");
		System.out.println("\nRules for this game:");
		System.out.println("Rule 1: You need enter only 1 Letter");
		System.out.println("Rule 2: You need enter the alphabet in UPPER CASE");
		System.out.print("\nEnter the Character to guess: ");

		input_ch = (char) System.in.read();

		System.out.println("\n");
		System.out.println("You have entered :" + input_ch + " and .......................");
		System.out.print("\nCountdown Starts :\n");

		for (int i = 5; i >= 1; i -= 1) {
			Thread.sleep(1000);
			System.out.println(i + "\t");
		}

		Thread.sleep(1000);

		if (input_ch == answer) {
			System.out.println("!!!Wow You are the winner!!!");
		} else if (input_ch > answer) {
			System.out.println("Sorry,  you choose the value as High");
		} else {
			System.out.println("Sorry,  you choose the value as Low");
		}
	}

}
