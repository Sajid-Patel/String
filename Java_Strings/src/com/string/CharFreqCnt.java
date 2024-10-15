package com.string;

class CharFreqCnt {

	public static void main(String[] args) {
		String s = "Tabassum";

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					ch[j] = 0;
					count++;
				}
			}

			if (ch[i] != 0) {
				System.out.println(ch[i] + " : " + count);
			}
		}

	}

}
