
package com.string;

/*
 Anagram String= 2 Strings with same letters and same length
 */
class Anagram_String {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		int count = 0;

		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				count++;
				break;
			}
		}

		if (count == ch1.length) {
			System.out.println("Both are Anagram String");
		} else {
			System.out.println("Both are not Anagram String");
		}
	}

}
