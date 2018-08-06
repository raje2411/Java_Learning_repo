package java_projects;

import java_projects.random_number;
//import java_projects.console_output;

public class Array_irregular {

	public Array_irregular() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Variable & Object declare
		int[][] irregular_array_table = new int[10][];
		int arraylen = 10, min = 100, max = 20000;
		random_number randnumObj = new random_number(arraylen);
		// console_output output_tofile = new
		// console_output("/Users/rraman/git/Java_Learning_repo/console_output/Array_2D_output.txt");

		// Creating irregular array with a for loop. Cool ah!!
		for (int i = 0; i < irregular_array_table.length; i++) {
			if (i < ((irregular_array_table.length) - 2)) {
				irregular_array_table[i] = new int[10];
			} else if (i < ((irregular_array_table.length))) {
				irregular_array_table[i] = new int[2];
			}
		}

		// inserting some random data to the irregular array.
		// Notice i have used my java_projects.random_number class to generate the
		// random values

		for (int i = 0; i < irregular_array_table.length; i++) {

			if (i < ((irregular_array_table.length) - 2)) {

				for (int j = 0; j < irregular_array_table[i].length; j++) {
					randnumObj.generate(arraylen, min, max);
					irregular_array_table[i][j] = randnumObj.array_with_rand_num[j];
				}
			} else if (i < ((irregular_array_table.length))) {
				for (int j = 0; j < irregular_array_table[i].length; j++) {
					randnumObj.generate(arraylen, min, max);
					irregular_array_table[i][j] = randnumObj.array_with_rand_num[j];
				}

			}

		}

		// Printing the irregular_array_table
		for (int i = 0; i < irregular_array_table.length; i++) {
			if (i < ((irregular_array_table.length) - 2)) {

				for (int j = 0; j < irregular_array_table.length; j++) {
					System.out.print(irregular_array_table[i][j] + "\t");
				}
			} else if (i < ((irregular_array_table.length))) {
				for (int j = 0; j < irregular_array_table[i].length; j++) {
					System.out.print(irregular_array_table[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}

}
