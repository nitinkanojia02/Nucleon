
import java.util.*;

class SumBetweenTwoInteger {
	static int sumDivisibles(int A, int B, int M) {
		int sum = 0;
		for (int i = A; i <= B; i++)

			if (i % M == 0)
				sum += i;
		return sum;
	}

	public static void main(String[] args) {
		int M = 7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number:");
		int A = sc.nextInt();
		System.out.println("Enter The Second Number:");
		int B = sc.nextInt();
		System.out.print(sumDivisibles(A, B, M) + "\n");
	}
}
