package com.string;

import java.util.Scanner;

/*
Problem Statement=
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
String s="( ) { } [ ]";

Ascii Values =
( = 40
) = 41
{ = 123
} = 125
[ = 91
] = 93
 

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true


Example 2:
Input: s = "()[]{}"
Output: true


Example 3:
Input: s = "(]"
Output: false


Example 4:
Input: s = "([])"
Output: true
*/
public class ValidParentheses {

	public boolean isValid(String s) {
		String temp = s;
		// temp = "( ) { } [ ]";
		char ch[] = temp.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == 40 && ch[j] == 41) {
					return true;
				} else if (ch[i] == 123 && ch[j] == 125) {
					return true;
				} else if (ch[i] == 91 && ch[j] == 93) {
					return true;
				} else if ((ch[i] == 40 && ch[j] == 41) && (ch[i] == 123 && ch[j] == 125)
						&& (ch[i] == 91 && ch[j] == 93)) {
					return true;
				} else {
					return false;
				}

			}
		}
		return true;

	}

	public static void main(String[] args) {

		String T = "()";
		ValidParentheses vp = new ValidParentheses();

		System.out.println(vp.isValid(T));
	}

}
