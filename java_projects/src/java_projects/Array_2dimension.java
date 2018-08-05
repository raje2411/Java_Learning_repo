package java_projects;

public class Array_2dimension {

	public Array_2dimension() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] table = new int[9][9];
		String[][] str_table = { { "aa", "ab" }, { "ba", "bb" } };

		/*
		 * Goal is to print the int array as 
		 * 1 2
		 * 3 4
		 */
		System.out.println("\nPrinting int Array table[][]: \n");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				table[i][j] = (i * table.length) + j + 1;
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}

		/*
		 * Goal is to print string array as
		 * aa ab
		 * ba bb
		 */
		
		System.out.println("\nPrinting String Array str_table[][]: \n");
		for (int i = 0; i < str_table.length; i++) {

			for (int j = 0; j < str_table.length; j++) {
				System.out.print(str_table[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
