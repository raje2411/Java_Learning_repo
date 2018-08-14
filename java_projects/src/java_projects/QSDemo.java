package java_projects;

class quicksort {
	
	static int counter = 1;

	static void qsort(char items[]) {
		qs(items, 0, items.length - 1);
		// sending to qs method to sort the array
	}

	private static void qs(char items[], int left, int right) {
		
		int i = left;
		int j = right;
		char x, y;
		x = items[((left + right) / 2)];
		

		System.out.println("\n");
		System.out.println("x value is : " + x);
		do {
		//	System.out.println("Value of i is " + i);
		//	System.out.println("Value of j is " + j);
			while ((items[i] < x) && (i < right)) {
				i++;

			}

			while ((x < items[j]) && (j > left)) {
				j--;
		//		System.out.println(" j Iteration number is " + counter);
				
		//		System.out.println("Value of j is " + j);

			}
			if(i<=j) {
				System.out.print("Array after iteration :"+counter);
				for (int xx = 0; xx < items.length; xx++)
					System.out.print("\t" + items[xx]);
				counter++;
				}
			System.out.println("\n");
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;

			}

		} while (i <= j);

		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);

	}

}

public class QSDemo {
	public static void main(String[] args) {
		char a[] = { 'a', 'z', 'b', 'e', 'i', 'c', 'g', 'a', 'g' };

		System.out.print("Array before sorting :");
		for (int i = 0; i < a.length; i++)
			System.out.print("\t" + a[i]);

		System.out.println("\n\n");
		quicksort.qsort(a);
		
		System.out.println("\n\n");
		System.out.print("Array after quick sorting :");
		for (int i = 0; i < a.length; i++)
			System.out.print("\t" + a[i]);

	}

}
