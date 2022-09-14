package ArrayAssignment;

public class CountDuplicate_2 {

public static void main(String[] args) {
		
		int count = 1, temp = 0;
		int arr[] = {13,7,11,7,19,11,23,14,19};

		for (int i = 0; i <= arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					temp = arr[j];
					count++;
					System.out.println(temp + " " + count);
				}

			}
			count = 1;
		}
	}
	
}
