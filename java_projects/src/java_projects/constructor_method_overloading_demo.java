package java_projects;

class overload_class_for_constructor_method {
	int sum;

	overload_class_for_constructor_method(int input_num) {
		sum = 0;
		for (int i = 0; i <= input_num; i++) {
			sum = sum + i;
		}

	}

	overload_class_for_constructor_method(overload_class_for_constructor_method input_obj) {
		this.sum = input_obj.sum;
	}
}

public class constructor_method_overloading_demo {
	public static void main(String[] args) {
		overload_class_for_constructor_method obj_ovld_const = new overload_class_for_constructor_method(5);
		overload_class_for_constructor_method obj2_ovld_const = new overload_class_for_constructor_method(
				obj_ovld_const);
		System.out.println(
				"First object sends 5 as input so \nOverload_class_for_constructor_method(int) is used, and the sum is:\t"
						+ +obj_ovld_const.sum);
		System.out.println("\n");
		System.out.println(
				"Sencod object sends the first object(obj_ovld_const) as input and \nOverload_class_for_constructor_method(overload_class_for_constructor_method) constructor is used and the sum is : \t"
						+ obj2_ovld_const.sum);

		obj_ovld_const.sum = obj_ovld_const.sum * 2; // multiplying to first object value, to show they both are
														// different

		System.out.println("\n\nAfter Multiplication of first object by 2\n");
		System.out.println("First object sum value now : " + obj_ovld_const.sum);
		System.out.println("\n\nSecond object sum value (unchaged) : " + obj2_ovld_const.sum);

	}

}
