package java_projects;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;
/*
(or the following) - 
Note: always remember to import only the classes you really needed, import with * is not best if it has lots of class which you don't use in program

import java.util.*;
import java.util.concurrent.*;
*/
public class ArrayDemo2 {

	public static void main(String[] args) {
		Integer number[] = new Integer[100]; // using Integer which is wrapper around "int" type as Object, bit slower
												// than primitive types
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

		Arrays.sort(number, Collections.reverseOrder()); // sorting the array number[]

		// Arrays.sort(a, c);

		for (int i = 0; i < 100; ++i) {
			System.out.println("number[" + i + "] is " + number[i]);
		}

		/*  Advanced foreach loop style used for arrays
		 * 
		 * for (int i : number) {
		 * System.out.println(" Sorted BY array values FOR number[] --> " + i); }
		 */
	}

}