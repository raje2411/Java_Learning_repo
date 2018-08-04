package java_projects;

public class Escape_sequences {
	public static void main(String args[]) {
		String tab = "\t"; // to print two tabs when this "tab" literal is called in the println

		System.out.println("This Proram is to test on Java Escapate Sequnences");

		System.out.println("To print \r\"'\" ");

		System.out.println("To print \fabc\"'\" ");

		System.out.println("printing tab between 1 and " + (tab + tab + tab) + " \\t\"3t\" 9999");

	}

}