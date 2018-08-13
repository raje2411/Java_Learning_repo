package java_projects;

class factorial {
	long result=0;

	long fact_recursive(int number) {

		if (number == 1) {
			System.out.print("1=  ");
			return 1;
		}
		System.out.print(number + "*");
		//System.out.println("Result now is" +result);
		result = fact_recursive(number - 1) * number;
		return result;
	}

}

public class recurssion_factorial_demo {

	public static void main(String args[]) {

		factorial obj_fact = new factorial();

		System.out.println("Factorial of 59 is : \n\n\n");
		System.out.println(obj_fact.fact_recursive(59));
		//long variable can store the factorial upto 59

	}

}
