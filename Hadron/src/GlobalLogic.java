import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class GlobalLogic {
	public static void main(String[] args) {
		System.out.println("Enter the number of integers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the numbers ");
		int[] arr = new int[n];
		int sumG = 0;
		int sumB = 0;
		ArrayList<Integer> al = new ArrayList();
		ArrayList<Integer> al1 = new ArrayList();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			al.add(arr[i]);
			al1.add(arr[i]);
		}
		Collections.sort(al);
		System.out.println();
		for (int j = 0; j < n; j++) {
			if (al.get(j) == al1.get(j))

				sumG = sumG + al1.get(j);
			else

				sumB = sumB + al1.get(j);
		}
		System.out.println("The Magic value is : " + (sumG - sumB));

	}
}
