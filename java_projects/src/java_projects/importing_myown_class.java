package java_projects;

//import java.util.Arrays;
import java_projects.random_number; //I have imported my own random_number class here to use in another program.
import java_projects.console_output;

public class importing_myown_class {
	public static void main(String[] args) {

		// specify the arraylength and the range for values with min and max
		int arraylen = 10000, min = 100, max = 10000000;
		random_number randnumObj = new random_number(arraylen);

		// Redirecting the console output to
		// /Users/rraman/git/Java_Learning_repo/console_output/myconsole_classExample_output.txt
		console_output output_tofile = new console_output("/Users/rraman/git/Java_Learning_repo/console_output/importing_myown_class_output.txt");
		output_tofile.hashCode();   //temp code
		randnumObj.generate(arraylen, min, max);

		System.out.println("Array Before Sorting:\n");

		for (int i = 0; i < randnumObj.array_with_rand_num.length; i++) {
			System.out.println(randnumObj.array_with_rand_num[i]);
		}

		/*
		 * for Sorted Arrary use this block
		 * System.out.println("\nAfter array Sorting:\n");
		 * 
		 * Arrays.sort(randnumObj.array_with_rand_num); // sorting the array
		 * randnumObj.array_with_rand_num
		 * 
		 * for (int i = 0; i < randnumObj.array_with_rand_num.length; i++) {
		 * System.out.println("randnumObj.array_with_rand_num[" + i + "] is " +
		 * randnumObj.array_with_rand_num[i]); }
		 */
	}

}
