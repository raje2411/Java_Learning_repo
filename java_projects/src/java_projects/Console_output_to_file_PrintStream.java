package java_projects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


class Vehicle_new{
	double mpg;
	int dist;

	public Vehicle_new(double m,int d) {
		// TODO Auto-generated constructor stub
		mpg=m*2;  //manipulating the input data mpg & data at object initialization
		dist=d*2;
	}
	
	public void Vehicle_method(double m,int d) {
		// TODO Auto-generated constructor stub
		mpg=m*3;   //manipulating the input data mpg & data
		dist=d*3;
	}
	
}
public class Console_output_to_file_PrintStream {
		
	
	public static void main(String[] args) {
		
		//Added the PrintStream to redirect the console output to save in a file
		try {
			PrintStream myconsole_output = new PrintStream(new File("//Users//rraman//git//Java_Learning_repo//console_output//myconsole_classExample_output.txt"));	
			System.setOut(myconsole_output);
		}
		
		catch(FileNotFoundException fx) {
			System.out.println(fx);
		}
		
		Vehicle_new obj_a = new Vehicle_new(9,9);
		Vehicle_new obj_b = new Vehicle_new(10,2);

		System.out.println("########################################################################################");
		System.out.println("\nValues before manipulation: \n"); 
		System.out.println("########################################################################################");
		
		System.out.println("                                                -----");
		System.out.println("I am accessing Vehicle class variables through obj_a:");
		System.out.println("                                                -----");
		System.out.println("mpg : "+obj_a.mpg);
		System.out.println("dist : "+obj_a.dist+"\n");
		
		System.out.println("                                                -----");
		System.out.println("I am accessing Vehicle class variables through obj_b:");
		System.out.println("                                                -----");
		System.out.println("mpg : "+obj_b.mpg);
		System.out.println("dist : "+obj_b.dist+"\n");


		obj_a.Vehicle_method(obj_a.mpg,obj_a.dist);
		obj_b.Vehicle_method(obj_b.mpg,obj_b.dist);
		
		System.out.println("########################################################################################");
		System.out.println("\nValues after calling Vehicle class --> Vehicle_method() to manipulate the data \n"); 
		System.out.println("########################################################################################");
		System.out.println("                                                -----");
		System.out.println("I am accessing Vehicle class variables through obj_a:");
		System.out.println("                                                -----");
		System.out.println("mpg : "+obj_a.mpg);
		System.out.println("dist : "+obj_a.dist+"\n");
		
		System.out.println("                                                -----");
		System.out.println("I am accessing Vehicle class variables through obj_b:");
		System.out.println("                                                -----");
		System.out.println("mpg : "+obj_b.mpg);
		System.out.println("dist : "+obj_b.dist+"\n");

		
	}

}
