package java_projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class console_output {

	console_output(String filepath){
		
		String file=filepath;
		// Added the PrintStream to redirect the console output to save in a file
		try {
			//PrintStream myconsole_output = new PrintStream(new File("//Users//rraman//git//Java_Learning_repo//console_output//myconsole_classExample_output.txt"));
			PrintStream myconsole_output = new PrintStream(new File(file));
			System.setOut(myconsole_output);
		}

		catch (FileNotFoundException fx) {
			System.out.println(fx);
		}
		System.out.println("This output is printed to file by console_output.java class");

	}
}
