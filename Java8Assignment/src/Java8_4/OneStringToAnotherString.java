package Java8_4;

import java.util.Arrays;
import java.util.List;

public class OneStringToAnotherString {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("tushar", "more");

		StringBuilder sb = new StringBuilder();
		list.forEach(sb::append);
		// System.out.println(sb);
		System.out.println(sb.insert(4, ""));
		// String con = sb.toString();

		System.out.println(sb);
	}
}
