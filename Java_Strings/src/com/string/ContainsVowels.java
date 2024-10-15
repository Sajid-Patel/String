package com.string;

class ContainsVowels {
	public static void main(String[] args) {
		System.out.println(ContainsVowels("Hello")); // true
		System.out.println(ContainsVowels("TV")); // false
	}

	public static boolean ContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
