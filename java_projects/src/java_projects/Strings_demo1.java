package java_projects;

public class Strings_demo1 {

	public Strings_demo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Hi how are you Hi";
		String y = "Hi how are you Hi";

		if (x.toUpperCase().equals(y.toUpperCase())) { // Added toUpperCase() to remove case sensitivity in strings
			System.out.println("Strings stored in x and y are equal");
			System.out.println("x is :" + x);
			System.out.println("x length is :" + x.length());
			System.out.println("x 5th char is :" + x.charAt(5));

			// Ascii value for first letter in "abc" is a=1 and first letter in "zaz" is
			// z(which is 26)
			// so 1-26= -25, if the first letter matches in both the words, then it checks
			// the next char from each word. I have used compareToIgnoreCase , you can also
			// compareTo(some string) if case sensitivity is needed
			System.out.println("abc".compareToIgnoreCase("zaz"));

			// Searching a keyword in a String , to get the first match index position or -1
			// if not found
			String search_word = "Hi"; // play around by chaning the search_word

			if (x.indexOf(search_word) != -1)
				System.out.println("The word \"" + search_word
						+ "\" was FIRST found at the position x[" + x.indexOf(search_word) + "]");
			else {
				System.out.println(
						"The word \"" + search_word + "\" you have asked me to find is not present in the string x");
			}
			
			//To find the search_word last found
			if (x.lastIndexOf(search_word) != -1)
				System.out.println("The word \"" + search_word
						+ "\" was LAST found at the position x[" + x.lastIndexOf(search_word) + "]");
			else {
				System.out.println(
						"The word \"" + search_word + "\" you have asked me to find is not present in the string x");
			}
			

		} else {

			System.out.println("Strings stored in x and y are NOT equal");

		}

	}

}
