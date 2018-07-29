package java_projects;

public class Truth_table_Logical_Operators {

	public static int and_method(boolean x, boolean y) {
		int ret = 999;
		if (x && y) {
			ret = 1;
		} else {
			ret = 0;
		}
		return (ret);

	}

	public static int or_method(boolean x, boolean y) {
		int ret = 999;
		if (x || y) {
			ret = 1;
		} else {
			ret = 0;
		}
		return (ret);

	}

	public static int xor_method(boolean x, boolean y) {
		int ret = 999;
		if (x ^ y) {
			ret = 1;
		} else {
			ret = 0;
		}
		return (ret);

	}

	public static int not_method(boolean x) {
		int ret = 999;
		if (!x) {
			ret = 1;
		} else {
			ret = 0;
		}
		return (ret);

	}

	public static void print_method(boolean p_print, boolean q_print) {

		String tab = "\t";

		int pi_print, qi_print;

		if (p_print) {
			pi_print = 1;
		} else {
			pi_print = 0;
		}

		if (q_print) {
			qi_print = 1;
		} else
			qi_print = 0;

		System.out.print(pi_print + tab + qi_print + tab);
		System.out.print(and_method(p_print, q_print));
		System.out.print(tab);
		System.out.print(or_method(p_print, q_print));
		System.out.print(tab);
		System.out.print(xor_method(p_print, q_print));
		System.out.print(tab);
		System.out.print(not_method(p_print) + "\n");
	}

	public static void main(String args[]) {

		boolean p, q;

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		// case1
		p = true;
		q = true;
		print_method(p, q);

		// case2
		p = true;
		q = false;
		print_method(p, q);

		// case3
		p = false;
		q = true;
		print_method(p, q);

		// case4
		p = false;
		q = false;
		print_method(p, q);

	}

}