import java.util.Scanner;

public class AlternatePrimeNumbers {

	public static void main(String[] args) {
		int flag = 0;

		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] a = new char[50];

		for (int i = 0; i < text.length(); i++)
		{
			a[i] = text.charAt(i);
			int ascii = a[i];
			int ascii0 = a[0];
			int ascii1 = a[text.length()];
			if (ascii == 32)
				System.out.println("NO");
			else if ((ascii0 < 65 || ascii0 > 90) && (ascii1 < 65 || ascii1 > 90))
				System.out.println("NO");
			else if (ascii > 47 && ascii < 58) {
				flag = flag++;
				if (flag > 2)
					System.out.println("NO");
			} else if ((a[i + 1] - a[i] > 1))
				System.out.println("NO");
			
			

		}

	}

}