package com.String;

public class RemoveVowels_3 {
	
	public static void main(String[] args) {
		
		RemoveVowels_3 rv=new RemoveVowels_3();
		System.out.println(rv.removeVowels("TUSHAR"));
		
	}

	private String removeVowels(String receivedStr) {
		
		char[] charArray = receivedStr.toCharArray();
		String returnStr = "";
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {
				charArray[i] = ' ';	
			}
		}
		for (char c : charArray) {
			if (c != ' ')
				returnStr += c;
		}
		return returnStr;
	}
	
}
