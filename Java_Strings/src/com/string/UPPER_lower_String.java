package com.string;

/*
 Converts lowercase to Uppercase
 */
class UPPER_lower_String {

	public static void main(String[] args) {
		String s = "sajid PaTEl";
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122) {
				char c = (char) (ch[i] - 32);

				System.out.print(c + " ");
			} else {
				//System.out.print(ch[i] + "");
			}
		}
	}

}
