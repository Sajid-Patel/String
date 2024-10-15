package com.string;

class LengthOfString {
	public static void main(String[] args) {

		String s = "Ssssajid";
		// System.out.println(s.length());

		char ch[] = s.toCharArray();
		// System.out.println(ch.length);

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 0) {
				count++;

			}

		}
		System.out.println(count);

	}
}