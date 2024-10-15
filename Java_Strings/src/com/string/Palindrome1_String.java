package com.string;

import java.util.Scanner;

class Palindrome1_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = s.next();

		String og_str = str;

		String rev = "";

		int lnth = str.length();

		for (int i = lnth - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Print the reverse of entered String
		System.out.println("Reverse of Entered String = " + rev);

		// check entered String is Palindrome or not
		if (og_str.equals(rev)) {
			System.out.println(og_str + " is Palindrome");
		} else {
			System.out.println(og_str + " is not Palindrome");
		}

	}

}
