import java.util.Scanner;

public class RemoveConsicutiveDuplicates {

	public static void main(String[] args) {
		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				System.out.print(ch[str.length() - 1]);
				break;

			}
			if (ch[i] == 0)
				System.out.print("");
			else if (ch[i] == ch[i + 1]) {
				System.out.print(ch[i]);
				ch[i + 1] = 0;

			} else if (ch[i] != ch[i + 1])
				System.out.print(ch[i]);
		}
	}

}
