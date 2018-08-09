/*
Java’s Access Modifiers:

Member access control is achieved through the use of three access modifiers:
public, private, and protected. As explained, if no access modifier is used, the
default access setting is assumed. In this program we will be concerned with
public and private. The protected modifier applies only when inheritance is
involved

 */

package java_projects;

class access_control_class {
	private int var_private = 1; // Private access, only methods(like method_to_access_private_variable) of
									// access_control_class, can access
	public int var_public = 2; // public access to this var
	int var_default_public = 3; // default access is public unless specified

	void method_to_access_private_variable() {
		System.out.println("You can access var_private only through me");
		System.out.println("Value stored in var_private is :" + var_private);
	}

}

public class Access_modifiers_public_Private_demo {
	public static void main(String[] args) {

		access_control_class obj_access_test = new access_control_class();

		System.out.println("Trying to access var_public and it's value is " + obj_access_test.var_public);
		System.out
				.println("Trying to access var_default_public and it's value is " + obj_access_test.var_default_public);
		// System.out.println("Trying to access var_private and it's value is "
		// +obj_access_test.var_private);
		/*
		 * This cod is not allowing me to compile the program and i recieve the
		 * following error
		 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * The field access_control_class.var_private is not visible
		 * 
		 * at java_projects.Access_modifiers_public_Private_demo.main(
		 * Access_modifiers_public_Private_demo.java:33)
		 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 * But i can access through
		 * access_control_class.method_to_access_private_variable() method
		*/
		System.out.println("Trying to access var_private and it's value is ");
		obj_access_test.method_to_access_private_variable();

		/*
		 * The key point is this: A private member can be used freely by other members
		 * of its class, but it cannot be accessed by code outside its class.
		 */
	}

}
