package javaprogram;

import java.util.HashSet;

public class NonRepeatedCharacters {
	public static void main(String[] args) {
		String str = "testyantra";
		char[] ch = str.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		HashSet<Character> hs1 = new HashSet<>();
		for (char flag : ch)
			hs1.add(flag);
		for (int i = 0; i < str.length(); i++) {
			if (hs.add(ch[i]) == false) {
				hs1.remove(ch[i]);

			}

		}
		for (Character temp : hs1)
			System.out.println(temp);
	}
}