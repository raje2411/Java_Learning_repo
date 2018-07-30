/*  A simple JAVA Help system to get the syntax for the most used JAVA commands */
package java_projects;

public class Help {

	public static void main(String[] args) throws java.io.IOException {
		char choice;
		String tab = "\t";

		System.out.println("Help on:");
		System.out.println(tab + "1. if statement");
		System.out.println(tab + "2. switch Control");
		System.out.println(tab + "3. For Loop");
		System.out.print("\nChoose the options : ");
		System.out.println("\n(enter the relevant number) ");

		choice = (char) System.in.read();

		System.out.println("\nSyntax:\n");

		switch (choice) {

		case '1':
			System.out.println("1. if statement");
			System.out.println();
			System.out.println("if(condition)");
			System.out.println(tab + "{");
			System.out.println(tab + "statement(s);");
			System.out.println(tab + "}");
			System.out.println("else ");
			System.out.println(tab + "{");
			System.out.println(tab + "statement(s);");
			System.out.println(tab + "}");
			break;

		case '2':
			System.out.println("2. switch Control");
			System.out.println();
			System.out.println("switch(expression)");
			System.out.println(tab + "{");
			System.out.println(tab + tab + "case constant:");
			System.out.println(tab + tab + tab + "statement sequence;");
			System.out.println(tab + tab + tab + "break;");
			System.out.println(tab + tab + "// .... ");
			System.out.println(tab + tab + "default:");
			System.out.println(tab + tab + tab + "statement sequence;");
			System.out.println(tab + tab + tab + "break;");
			System.out.println(tab + "}");
			System.out.println("\nNote: Switch can't use floating point variables, you need to use\nif-else-if ladder for those scenarios");
			break;
			
		case '3':
			System.out.println("3. For Loop");
			System.out.println();
			System.out.println("for (int i=0; i < 10; i++)");
			System.out.println("{");
			System.out.println(tab + "statement sequences;");
			System.out.println("}");
			break;
			
		default:
			System.out.println("These options are not implemented yet.\n You are free to contribute..");
			break;

		}

	}

}
