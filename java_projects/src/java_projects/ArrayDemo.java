package java_projects;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayDemo {

	public static void main(String[] args) {
		int number[] = new int[100];
		int min = 10;
		int max = 200;

		for (int i = 0; i < 100; ++i) {

			number[i] = ThreadLocalRandom.current().nextInt(min, max + 1);

		}

		System.out.println("Array Before Sorting:\n");

		for (int i = 0; i < 100; ++i) {

			System.out.println("number[" + i + "] is " + number[i]);
		}

		System.out.println("\nAfter array Sorting:\n");

		Arrays.sort(number); // sorting the array number[]

		/*
		 * for (int i = 0; i < 100; ++i) {
		 * 
		 * System.out.println("number[" + i + "] is " + number[i]); }
		 */

		for (int i : number) {
			System.out.println(" Sorted BY array values FOR number[] --> " + i);
		}
	}

}