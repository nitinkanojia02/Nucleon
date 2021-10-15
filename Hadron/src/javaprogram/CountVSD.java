package javaprogram;

public class CountVSD {

	public static void main(String[] args) {
		String str = "my nam2e i1s ni3tin";
		char[] ch = str.toCharArray();
		int spaces = 0;
		int vowels = 0;
		int num = 0;
		int a = -1;
		for (char temp : ch) {
			try {
				Integer.parseInt(String.valueOf(temp));
				num++;
			} catch (Exception e) {

			}
			if (temp == ' ')
				spaces++;
			if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
				vowels++;
		}
		System.out.println("Vowels:" + vowels + "\nDigits:" + num + "\nSpaces:" + spaces);
	}

}
