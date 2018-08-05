package java_projects;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.Collections;

class random_number {

	int length;
	int[] array_with_rand_num;

	random_number(int ln) {
		length = ln;
		array_with_rand_num = new int[length];
	}

	int[] generate(int ln, int min, int max) {
		for (int i = 0; i < ln; ++i) {

			array_with_rand_num[i] = ThreadLocalRandom.current().nextInt(min, max + 1);

		}
		return array_with_rand_num;
	}

}

public class Array_Length_Demo {

	public static void main(String[] args) {
		
		int arraylen=10, min = 20, max = 40;
		
		random_number randnumObj = new random_number(arraylen);
		
		randnumObj.generate(arraylen, min, max);

		System.out.println("Array Before Sorting:\n");

		for (int i = 0; i < randnumObj.array_with_rand_num.length; i++) {
			System.out.println("randnumObj.array_with_rand_num[" + i + "] is " + randnumObj.array_with_rand_num[i]);
		}

		System.out.println("\nAfter array Sorting:\n");

		Arrays.sort(randnumObj.array_with_rand_num); // sorting the array randnumObj.array_with_rand_num

		for (int i = 0; i < randnumObj.array_with_rand_num.length; i++) {
			System.out.println("randnumObj.array_with_rand_num[" + i + "] is " + randnumObj.array_with_rand_num[i]);
		}

	}

}