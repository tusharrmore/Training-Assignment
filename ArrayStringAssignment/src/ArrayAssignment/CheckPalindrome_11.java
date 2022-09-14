package ArrayAssignment;

public class CheckPalindrome_11 {

	public static void main(String[] args) {

		String[] strArr = { "xyz", "abc", "sagar", "pqrs", "6789" };
		String palindrome = "";
		for (int i = 0; i < strArr.length; i++) {
			String rev = "";
			for (int j = strArr[i].length() - 1; j >= 0; j--) {
				rev = rev + strArr[i].charAt(j);
			}
			System.out.println("rev=" + rev);
			if (strArr[i].equals(rev)) {
				palindrome += strArr[i] + " ";
			}
		}

		System.out.println("Palindrome Strings= " + palindrome);
	}

}
