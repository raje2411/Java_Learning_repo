package java_projects;

class Outer {

	int[] nums;

	void analyze(int n[]) {
		nums = n;
		Inner inob = new Inner();
		System.out.println("Min value in the array is : " + inob.min());
		System.out.println("Max value in the array is : " + inob.max());
		System.out.println("Avg value of the array is : " + inob.avg());

	}

	class Inner {
		int min() {
			int min = nums[0];

			for (int i = 1; i < nums.length; i++)
				if (nums[i] < min)
					min = nums[i];

			return min;
		}

		int max() {

			int max = nums[0];

			for (int i = 1; i < nums.length; i++)
				if (nums[i] > max)
					max = nums[i];

			return max;

		}

		double avg() {

			double sum = 0;
			for (int i = 0; i < nums.length; i++)
				sum += nums[i];

			return (double) (sum / nums.length);
		}
	}

}

public class InnderClassDemo {

	public static void main(String[] args) {

		int[] a = { 981, 4544, 325, 712, 223, 5232, 2322, 112, 99 };

		System.out.println("Given array values");
		for (int i : a)
			System.out.print(i+"\t");
		System.out.println("\n");
		Outer outob = new Outer();

		outob.analyze(a);

	}

}
