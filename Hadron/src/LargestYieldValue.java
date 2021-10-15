
public class LargestYieldValue {

	public static void main(String[] args) {

		int[] arr = { 1, 34, 3, 98, 9, 76, 45, 4 };

		int index = 0;
		for (int j = 0; j < arr.length; j++) {
			int maxnum = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] == 0)
					System.out.print("");
				else if (maxnum < arr[i]) {
					maxnum = arr[i];
					index = i;
				}
			}
			arr[index] = 0;

			System.out.print(maxnum);
		}
	}
}
