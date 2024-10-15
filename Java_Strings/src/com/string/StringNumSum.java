package com.string;

/*
 From given String "abc1t2y5@gmail.com"
 extract numbers and add them
 1+2+5=8
 */
class StringNumSum {

	public static void main(String[] args) {

		String s = "rocksp5786@gmail.com";
		char ch[] = s.toCharArray();
		int sum = 0;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				sum = sum + ch[i] - 48;
			}
		}
		System.out.println("Sum of numeric value from String is : " + sum);

	}

}
