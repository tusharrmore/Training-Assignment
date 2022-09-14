package ArrayAssignment;

import java.util.Arrays;

public class ThirdMax_1 {

	public static void main(String[] args) {

		int[] a = { 1, 5, 3, 7, 6, 8, 2, 4 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);

	}

}
