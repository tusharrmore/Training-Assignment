package com.String;

public class TwoStringInput_1 {

	void additionofString(String s1, String s2, int index) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		char[] ch3 = new char[ch1.length + ch2.length];
		int temp = 0;

		for (int i = 0; i < ch1.length; i++) {

			if (i == index) {

				for (int j = 0; j < ch2.length; j++) {
					ch3[temp++] = ch2[j];
				}
			}
			ch3[temp++] = ch1[i];

		}

		System.out.println("final o/p=" + new String(ch3));

	}

	public static void main(String[] args) {
		TwoStringInput_1 tsi = new TwoStringInput_1();
		tsi.additionofString("tushar", "xyz", 1);

	}

}
