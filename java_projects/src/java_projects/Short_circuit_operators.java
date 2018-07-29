package java_projects;

public class Short_circuit_operators {

	public static void main(String args[]) {

		int i = 2;
		int num = 10;

		if (i != 0 && num % i == 0)
			{
			System.out.println(num + " modulo " + i + " is zero");
			}
		

		i = 0;
		if (i != 0 && num % i == 0)
		{
			
			System.out.println(
					"This won't execute, as i =0 and the short circuit kicks in and the second operand will not execute");
		}
		
		// The below if will fail, since i am not using && both the operands will
		// execute first
		// and it make 10%0 to throw run time error "Exception in thread "main"
		// java.lang.ArithmeticException: / by zero"
		if (i != 0 & num % i == 0)
		{
			System.out.println(
			
					"This won't execute, as i =0 and the short circuit kicks in and the second operand will not execute");
		}
		
		// this debugging println wont execute, as the above run time exception caused
		// the program to exit
		System.out.println("This wont execute as the above line made the program to exit");
	}

}
