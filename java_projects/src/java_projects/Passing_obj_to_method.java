package java_projects;

class Block {

	int a, b, c, volume;

	Block(int ai, int bi, int ci) {
		a = ai;
		b = bi;
		c = ci;
		volume = (a * b * c);
	}

	boolean check_dimension(Block input_obj) { // checks the a,b,c dimension values are same for both calling object and
												// passing object
		if ((input_obj.a == a) & (input_obj.b == b) & (input_obj.c == c))
			return true;
		else
			return false;
	}

	boolean check_volume(Block input_obj) { // checks the passing object volume is equals to calling objects volume
		if (input_obj.volume == volume)
			return true;
		else
			return false;
	}

}

public class Passing_obj_to_method {

	public static void main(String[] args) {

		Block obja = new Block(4, 4, 5);
		Block objb = new Block(4, 4, 5);
		Block objc = new Block(8, 8, 2);

		// Comparing obja dimension with objb
		System.out.println("Check obja dimension with objb and the result is :" + obja.check_dimension(objb));
		// Comparing obja dimension with objc
		System.out.println("Check obja dimension with objc and the result is :" + objc.check_dimension(obja));
		// Comparing obja volume with objc
		System.out.println("Check obja dimension with objb and the result is :" + obja.check_volume(objc));
	}

}
