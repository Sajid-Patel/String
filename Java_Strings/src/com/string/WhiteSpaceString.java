package com.string;

/*
 Remove White space from String
 ASCII value for empty space is 32
 
 sample= Sajid Patel
 o/p= SajidPatel
 */
class WhiteSpaceString {

	public static void main(String[] args) {

		String s = "Sajid   Patel";
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 32) {
				ch[i] = (char) -1;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
