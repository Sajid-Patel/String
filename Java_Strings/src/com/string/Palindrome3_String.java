package com.string;

class Palindrome3_String {

	public static void main(String[] args) {
		String s = "java";
		char a[] = s.toCharArray();
		char rev[] = new char[a.length];

		for (int i = a.length - 1, k = 0; i >= 0; i--, k++) {
			rev[k] = a[i];

		}

		String revStr = new String(rev);

		if (s.equals(revStr)) {
			System.out.println(s + " is Palandrome");
		} else {
			System.out.println(s + " is not Palandrome");
		}
	}

}
