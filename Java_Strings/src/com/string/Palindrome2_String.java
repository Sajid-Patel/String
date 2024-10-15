package com.string;

class Palindrome2_String {

	public static void main(String[] args) {
		String s = "nitin";
		String revStr = "";

		char ch[] = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			revStr = revStr + ch[i];

		}

		if (s.equals(revStr)) {
			System.out.println(s + " is Palandrome");
		} else {
			System.out.println(s + " is not Palandrome");
		}
	}

}
