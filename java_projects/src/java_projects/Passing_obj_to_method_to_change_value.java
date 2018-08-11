package java_projects;

class Block_test {

	int a, b, c;
	int volume;

	Block_test(int ai, int bi, int x) {
		a = ai;
		b = bi;
		c = x;
		volume = (a * b * c);
	}

	boolean check_dimension(Block_test input_obj) { // checks the a,b,c dimension values are same for both calling
													// object and
		// passing object
		if ((input_obj.a == a) & (input_obj.b == b) & (input_obj.c == c))
			return true;
		else
			return false;
	}

	boolean check_volume(Block_test input_obj) { // checks the passing object volume is equals to calling objects volume
		if (input_obj.volume == volume)
			return true;
		else
			return false;
	}
	
	void change_object(Block_test input_obj) {
		input_obj.volume = volume *2;
		input_obj.a=a *2;
		input_obj.b=b *2;
		input_obj.c=c *2;
	}
	
	void print_dimension() {
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
		System.out.println("c is:"+c);
		System.out.println("volume is:"+volume);
		
	}

}

public class Passing_obj_to_method_to_change_value {

	public static void main(String[] args) {

		Block_test objc = new Block_test(1,9,100);
		Block_test obja = new Block_test(4,2,2);
		Block_test objb = new Block_test(4,2,2);
		
		
		
		obja.print_dimension();
		objb.print_dimension();
		objc.print_dimension();

		// Comparing obja dimension with objb
		System.out.println("Check obja dimension with objb and the result is :" + obja.check_dimension(objb));
		// Comparing obja dimension with objc
		System.out.println("Check obja dimension with objc and the result is :" + objc.check_dimension(obja));
		// Comparing obja volume with objc
		System.out.println("Check obja volume with objc and the result is :" + obja.check_volume(objc));
		// Comparing obja volume with objb
		System.out.println("Check obja volume with objb and the result is :" + objb.check_volume(obja));
		
		
		//Now we are going to manipulate/change a objects volume value by passing to a method
		obja.change_object(objb);
		System.out.println("Check obja volume with objb and the result is :" + objb.check_volume(obja));
		
		//"Printing all objects dimension:"
		
		obja.print_dimension();
		objb.print_dimension();
		objc.print_dimension();
		
	}

}
