package org.SortingMethod;

public class SortingIterationArray {

	public static void main(String[] args) { //10.04.2023 (Sorting String)

		int a[] = { 40, 20, 10, 30 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					int c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		System.out.println("After Sorting :\n");
		for (int b : a) {
			System.out.println(b);
		}
	}

}
