package javaprogram;

import java.util.HashSet;

public class RepeatedCharacters {
	public static void main(String[] args) {
		String str = "testyantra";
		char[] ch = str.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {

			if (hs.add(ch[i]) == false) {
				System.out.println(ch[i]);

			}

		}

	}
}